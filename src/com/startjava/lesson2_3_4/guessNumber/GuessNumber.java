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

    public GuessNumber(Player player) {
    }


    public void play() throws IOException {
        int rnd = (int) (Math.random() * 101);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("У вас 10 попыток");
        GuessNumber gn1 = new GuessNumber(player1);
        GuessNumber gn2 = new GuessNumber(player2);

        do {
            player1.setNumber(gn1.enterNumbers(rnd, player1.getName(), player1.getNumber()));
            player1.setAttempts(i, player1.getNumber());
            if(i == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if(player1.getNumber() == rnd) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + i++ + " попытки");
                break;
            }
            i++;
            player2.setNumber(gn2.enterNumbers(rnd, player2.getName(), player2.getNumber()));
            player2.setAttempts(j, player2.getNumber());
            if(j == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
            if(player2.getNumber() == rnd) {
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber() + " с " + j++ + " попытки");
                break;
            }
            j++;
        } while(player1.getNumber() != rnd && player2.getNumber() != rnd && i != 10 && j != 10);
    }

    public int enterNumbers(int rnd, String name,int number) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(name + " введите число : ");
        number = Integer.parseInt(reader.readLine());
        compareNumbers(rnd, number);
        System.out.println(compareNumbers(rnd, number));
        return number;
    }
            
    public String compareNumbers(int rnd, int number) {
        if(number == rnd) {
            return "Вы угадали!";
        } else if(number < rnd) {
            return "Число меньше искомого";
        } else {
            return "Число больше искомого";
        }
    }

    public void arrPrint(int[] num) {
        int[] newPlayer1Num = Arrays.copyOfRange(num, 0, i);
        for(int a = 0; a < i; a++) {
            System.out.print(newPlayer1Num[a] + " ");
        }

        System.out.println("");
    }
}