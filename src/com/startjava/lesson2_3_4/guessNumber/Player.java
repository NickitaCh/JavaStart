package com.startjava.lesson2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    private int numberOfAttempts = 0;

    public int getNumberOfAttempts() {
        return numberOfAttempts;
    }

    public void setNumberOfAttempts(int numberOfAttempts) {
        this.numberOfAttempts = numberOfAttempts;
    }

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return attempts[numberOfAttempts];
    }

    void setAttempt(int number) {
        attempts[numberOfAttempts] = number;
    }

    public int[] getAttemps() {
        return Arrays.copyOf(attempts, numberOfAttempts);
    }

    public void clear() {
        Arrays.fill(attempts, 0, numberOfAttempts, 0);
    }
}