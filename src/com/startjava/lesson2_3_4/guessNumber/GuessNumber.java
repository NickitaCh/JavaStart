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
        boolean stop;

        do {
            player1.setAttempt(enterNumber(player1.getName()));
            System.out.println(compareNumbers(secretNumber, player1.getNumber()));
            stop = check(player1.getNumber(), secretNumber, player1.getName(), player1.getNumberOfAttempts());
            player1.setNumberOfAttempts(player1.getNumberOfAttempts()+1);
            if (stop == false) {
                break;
            }
            player2.setAttempt(enterNumber(player2.getName()));
            System.out.println(compareNumbers(secretNumber, player2.getNumber()));
            stop = check(player2.getNumber(), secretNumber, player2.getName(), player2.getNumberOfAttempts());
            player2.setNumberOfAttempts(player2.getNumberOfAttempts()+1);
        } while(stop != false);
        showAttempts(player1.getAttemps());
        showAttempts(player2.getAttemps());
        player1.clear();
        player2.clear();
    }

    private boolean check(int number, int secretNumber, String name, int attempts) {
        if(attempts == 10) {
            System.out.println("У " + name + " закончились попытки");
            return false;
        }
        if(number == secretNumber) {
            System.out.print("Игрок " + name + " угадал число " + number);
            attempts++;
            System.out.println(" с " + attempts + " попытки");
            return false;
        } else return true;
    }

    private int enterNumber(String name) throws IOException {
        System.out.println(name + " введите число : ");
        return (Integer.parseInt(reader.readLine()));
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
        for (int number : attempts) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }
}