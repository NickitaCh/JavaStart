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

        for(int i = 0; i < 10; i++) {
            enterNumber(player1);
            if (compareNumbers(secretNumber, player1)) {
                break;
            }
            if (player1.getNumberOfAttempts() == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            enterNumber(player2);
            if (compareNumbers(secretNumber, player2)) {
                break;
            }
            if (player2.getNumberOfAttempts() == 10) {
                System.out.println("У " + player2.getName() + " закончились попытки");
            }
        }
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
        if (player.getNumber() == secretNumber) {
            System.out.println("Вы угадали!");
            System.out.println("Игрок " + player.getName() + " угадал число " + player.getNumber() + " с " + player.getNumberOfAttempts() + " попытки");
            return true;
        } else {
            System.out.println(player.getNumber() > secretNumber ? "Число больше искомого" : "Число меньше искомого");
        } return false;
    }

    private void showAttempts(int[] attempts) {
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}