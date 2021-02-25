package com.startjava.lesson2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int numberOfAttempts;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int[] getAttempts() {
        return Arrays.copyOf(attempts, numberOfAttempts);
    }

    public void setAttempt(int number) {
        attempts[numberOfAttempts] = number;
    }

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public int getNumber() {
        return attempts[numberOfAttempts];
    }

    public void clear() {
        Arrays.fill(attempts, 0, numberOfAttempts, 0);
    }
}