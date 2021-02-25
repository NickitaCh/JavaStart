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
        int secretNumber = 1;
        //(int) (Math.random() * 101);
        System.out.println("У вас 10 попыток");

        do {
            enterNumber(player1.getName(), player1);
            compareNumbers(secretNumber, player1);
            if (checkPlayerNumber(secretNumber, player1)) {
                break;
            }
            enterNumber(player2.getName(), player2);
            compareNumbers(secretNumber, player2);
            checkPlayerNumber(secretNumber, player2);
        } while(true);
        showAttempts(player1.getAttempts());
        showAttempts(player2.getAttempts());
        player1.clear();
        player2.clear();
    }

    private void enterNumber(String name, Player player) throws IOException {
        System.out.println(name + " введите число : ");
        player.setAttempt(Integer.parseInt(reader.readLine()));
    }

    private void compareNumbers(int secretNumber, Player player) {
        if(player.getNumber() < secretNumber) {
            System.out.println("Число меньше искомого");
        } else {
            System.out.println("Число больше искомого");
        }
    }

    private boolean checkPlayerNumber(int secretNumber, Player player) {
        if(player.getNumber() == secretNumber) {
            System.out.println("Вы угадали!");
            System.out.print("Игрок " + player.getName() + " угадал число " + player.getNumber());
            player.setNumberOfAttempts(player.getNumberOfAttempts()+1);
            System.out.println(" с " + player.getNumberOfAttempts() + " попытки");
            return true;
        }
        if(player.getNumberOfAttempts() == 10) {
            System.out.println("У " + player.getName() + " закончились попытки");
            return true;
        } else
            player.setNumberOfAttempts(player.getNumberOfAttempts()+1);
            return false;
    }

    private void showAttempts(int[] attempts) {
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}