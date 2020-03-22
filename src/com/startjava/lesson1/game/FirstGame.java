package com.startjava.lesson1.firstGame;

public class FirstGame {
    public static void main(String[] args) {
        int pcNum = 95;
        int userNum = 35;

        do {
            if (userNum > pcNum) {
                System.out.println("Введенное вами число больше того, что загадал компьютер");
                userNum -= 5;
            } else if (userNum < pcNum) {
                System.out.println("Введенное вами число меньше того, что загадал компьютер");
                userNum += 5;
            }
        } while (userNum != pcNum);
        
        System.out.println("Вы угадали!");
    }
}