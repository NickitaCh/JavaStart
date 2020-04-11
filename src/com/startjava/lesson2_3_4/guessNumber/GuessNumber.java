package com.startjava.lesson2_3_4.guessNumber;

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

        do {
            System.out.println(player1.getName() + " введите число : ");
            player1.setNumber(Integer.parseInt(reader.readLine()));
            player1.setNum(i, player1.getNumber());
            System.out.println(compareNumbers(rnd, player1.getNumber()));
            if(i == 10) {
                System.out.println("У " + player1.getName() + " закончились попытки");
            }
            if(player1.getNumber() == rnd) {
                System.out.println("Игрок " + player1.getName() + " угадал число " + player1.getNumber() + " с " + i++ + " попытки");
                break;
            }
            i++;

            System.out.println(player2.getName() + " введите число : ");
            player2.setNumber(Integer.parseInt(reader.readLine()));
            player2.setNum(j, player2.getNumber());
            System.out.println(compareNumbers(rnd, player2.getNumber()));
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

            
    public String compareNumbers(int rnd, int number) {
        if(number == rnd) {
            return "Вы угадали!";
        } else if(number < rnd) {
            return "Число меньше искомого";
        } else {
            return "Число больше искомого";
        }
    }

    public void arrPrint() {
        int[] newPlayer1Num = Arrays.copyOfRange(player1.getNum(), 0, i);
        for(int a = 0; a < i; a++) {
            System.out.print(newPlayer1Num[a] + " ");
        }

        System.out.println("");

        int[] newPlayer2Num = Arrays.copyOfRange(player2.getNum(), 0, j);
        for(int a = 0; a < j; a++) {
            System.out.print(newPlayer2Num[a] + " ");
        }

        System.out.println("");
    }
}