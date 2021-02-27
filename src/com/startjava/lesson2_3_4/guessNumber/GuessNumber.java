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
            enterNumber(player1);
            if (compareNumbers(secretNumber, player1)) {
                break;
            }
            enterNumber(player2);
            if (compareNumbers(secretNumber, player2)) {
                break;
            }
        } while (true);
        showAttempts(player1.getAttempts());
        showAttempts(player2.getAttempts());
        player1.clear();
        player2.clear();
    }

    private void enterNumber(Player player) throws IOException {
        System.out.println(player.getName() + " введите число : ");
        player.setAttempt(Integer.parseInt(reader.readLine()));
        player.setNumberOfAttempt(player.getNumberOfAttempts()+1);
    }

    private boolean compareNumbers(int secretNumber, Player player) {
        if (player.getNumber() == secretNumber || player.getNumberOfAttempts() == 10) {
            if (player.getNumber() == secretNumber) {
                System.out.println("Вы угадали!");
                System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + player.getNumberOfAttempts() + " попытки");
            }
            if(player.getNumberOfAttempts() == 10) {
                System.out.println("У " + player.getName() + " закончились попытки");
            }
            return true;
        } else {
            if (player.getNumber() < secretNumber) {
                System.out.println("Число меньше искомого");
            } else {
                System.out.println("Число больше искомого");
            }
        } return false;
    }

    private void showAttempts(int[] attempts) {
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}