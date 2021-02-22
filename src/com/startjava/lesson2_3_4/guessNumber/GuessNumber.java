package com.startjava.lesson2_3_4.guessNumber;

import cucumber.api.java.uk.Нехай;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    int i = 0;
    int j = 0;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws IOException {
        int rnd = (int) (Math.random() * 101);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("У вас 10 попыток");
        GuessNumber gn1 = new GuessNumber(player1, player1);
        GuessNumber gn2 = new GuessNumber(player2, player2);

        do {
            player1.setNumber(gn1.enterNumbers(player1.getName(), player1.getNumber()));
            System.out.println(compareNumbers(rnd, player1.getNumber()));
            player1.setAttempt(i, player1.getNumber());
            if(i == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if(player1.getNumber() == rnd) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + i++ + " попытки");
                break;
            }
            i++;
            player2.setNumber(gn2.enterNumbers(player2.getName(), player2.getNumber()));
            System.out.println(compareNumbers(rnd, player2.getNumber()));
            player2.setAttempt(j, player2.getNumber());
            if(j == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
            if(player2.getNumber() == rnd) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + j++ + " попытки");
                break;
            }
            j++;
        } while(player1.getNumber() != rnd && player2.getNumber() != rnd && i != 10 && j != 10);
        showAttempts(player1.getAttemps());
        showAttempts(player2.getAttemps());
        Arrays.fill(player1.getAttemps(), 0, i, 0);
        Arrays.fill(player2.getAttemps(), 0, i, 0);
    }

    private int enterNumbers(String name,int number) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(name + " введите число : ");
        number = Integer.parseInt(reader.readLine());
        return number;
    }
            
    private String compareNumbers(int rnd, int number) {
        if(number == rnd) {
            return "Вы угадали!";
        } else if(number < rnd) {
            return "Число меньше искомого";
        } else {
            return "Число больше искомого";
        }
    }

    private void showAttempts(int[] numbers) {
        int[] attempts = Arrays.copyOfRange(numbers, 0, i);
        for (int a:attempts) {
            System.out.print(a + " ");
        }
        System.out.println("");
    }
}