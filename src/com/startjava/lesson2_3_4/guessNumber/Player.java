package com.startjava.lesson2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setNumber(int number) {
        int i = -1;
        i++;
        attempts[i] = number;
    }

    public int getNumber() {
        int i = -1;
        i++;
        return attempts[i];
    }

    void setAttempt(int index, int num) {
        attempts[index] = num;
    }

    public int[] getAttemps() {
        int q = 1;
        if (attempts[q] != 0) {
            q++;
        }
        int [] attemptsCopy = Arrays.copyOf(attempts, q);
        return attemptsCopy;
    }
}