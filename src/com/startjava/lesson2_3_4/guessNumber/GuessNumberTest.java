package com.startjava.lesson2_3_4.guessNumber;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;
import java.util.Arrays;

public class GuessNumberTest {
    public static void main(String[] args) throws IOException {
        String answer = "да";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while(answer.equals("да")) {
            System.out.print("Введите имя первого игрока: ");
            Player player1 = new Player(reader.readLine());
            System.out.print("Введите имя второго игрока: ");
            Player player2 = new Player(reader.readLine());
            GuessNumber gn = new GuessNumber(player1, player2);
            gn.play();
            gn.arrPrint(player1.getAttemps());
            gn.arrPrint(player2.getAttemps());


            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = reader.readLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}