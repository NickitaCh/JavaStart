package com.startjava.lesson2_3_4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

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

        do {
            if (enterNumber(player1.getName(), player1, secretNumber) == false) {
                break;
            } else enterNumber(player2.getName(), player2, secretNumber);
        } while(true);
        showAttempts(player1.getAttemps());
        showAttempts(player2.getAttemps());
        player1.clear();
        player2.clear();
    }

    private boolean enterNumber(String name, Player player, int secretNumber) throws IOException {
        System.out.println(name + " введите число : ");
        player.setAttempt(Integer.parseInt(reader.readLine()));
        if (!compareNumbers(secretNumber, player.getNumber(), player.getName())) {
            check(player.getNumber(), secretNumber, player.getName(), player.getNumberOfAttempts());
            player.setNumberOfAttempts(player.getNumberOfAttempts());
            return false;
        } else {
            check(player.getNumber(), secretNumber, player.getName(), player.getNumberOfAttempts());
            player.setNumberOfAttempts(player.getNumberOfAttempts());
        } return true;
    }

    private boolean compareNumbers(int secretNumber, int number, String name) {
        if(number == secretNumber) {
            System.out.println("Вы угадали!");
            System.out.print("Игрок " + name + " угадал число " + number);
            return false;
        } else if(number < secretNumber) {
            System.out.println("Число меньше искомого");
            return true;
        } else {
            System.out.println("Число больше искомого");
            return true;
        }
    }

    private void check(int number, int secretNumber, String name, int attempts) {
        if(attempts == 10) {
            System.out.println("У " + name + " закончились попытки");
        }
        if(number == secretNumber) {
            attempts++;
            System.out.println(" с " + attempts + " попытки");
        }
    }

    private void showAttempts(int[] attempts) {
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}