package com.startjava.lesson2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int number;
    private int[] attempts = new int[10];

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    void setAttempt(int index, int num) {
        attempts[index] = num;
    }

    public int[] getAttemps() {
        int [] attemptsCopy = Arrays.copyOf(attempts, attempts.length);
        return attemptsCopy;
    }
}