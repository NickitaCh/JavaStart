package com.startjava.lesson2_3_4.guessNumber;

import cucumber.api.java.uk.Нехай;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

public class GuessNumber {
    private Player player1;
    private Player player2;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws IOException {
        int secretNumber = (int) (Math.random() * 101);
        System.out.println("У вас 10 попыток");
        boolean stop = true;

        do {
            player1.setAttempt(player1.numberOfAttempts, enterNumber(player1.getName()));
            System.out.println(compareNumbers(secretNumber, player1.getNumber(player1.numberOfAttempts)));
            if(player1.numberOfAttempts == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
                stop = false;
                break;
            }
            if(player1.getNumber(player1.numberOfAttempts) == secretNumber) {
                player1.numberOfAttempts++;
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber(player1.numberOfAttempts-1) + " с " + player1.numberOfAttempts + " попытки");
                stop = false;
                break;
            }
            player1.numberOfAttempts++;
            player2.setAttempt(player2.numberOfAttempts, enterNumber(player2.getName()));
            System.out.println(compareNumbers(secretNumber, player2.getNumber(player2.numberOfAttempts)));
            if(player2.numberOfAttempts == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
                stop = false;
                break;
            }
            if(player2.getNumber(player2.numberOfAttempts) == secretNumber) {
                player2.numberOfAttempts++;
                System.out.println("Игрок " + player2.getName() + " угадал число " + player2.getNumber(player2.numberOfAttempts-1) + " с " + player2.numberOfAttempts + " попытки");
                stop = false;
                break;
            }
            player2.numberOfAttempts++;
        } while(stop != false);
        showAttempts(player1.getAttemps(player1.numberOfAttempts));
        showAttempts(player2.getAttemps(player2.numberOfAttempts));
        player1.clear(player1);
        player2.clear(player2);
    }

    private int enterNumber(String name) throws IOException {
        System.out.println(name + " введите число : ");
        int number = Integer.parseInt(reader.readLine());
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

    private void showAttempts(int[] attempts) {
        for (int attempt : attempts) {
                System.out.print(attempt + " ");
        }
        System.out.println("");
    }
}