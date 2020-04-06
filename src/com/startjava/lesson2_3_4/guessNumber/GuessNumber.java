package com.startjava.lesson2_3_4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class GuessNumber {
    private Player player1;
    private Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void play() throws IOException {
        int rnd = (int) (Math.random() * 101);
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        do {
            System.out.println(player1.getName() + " введите число : ");
            player1.setNumber(Integer.parseInt(reader.readLine()));
            System.out.println(guess(rnd, player1.getNumber()));
            System.out.println(player2.getName() + " введите число : ");
            player2.setNumber(Integer.parseInt(reader.readLine()));
            System.out.println(guess(rnd, player2.getNumber()));
        } while(player1.getNumber() != rnd && player2.getNumber() != rnd);
    }

            
    public String guess(int rnd, int number) {
        if(number == rnd) {
            return "Вы угадали!";
        } else if(number < rnd) {
            return "Число меньше искомого";
        } else {
            return "Число больше искомого";
        }
    }
}