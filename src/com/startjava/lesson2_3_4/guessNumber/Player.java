package com.startjava.lesson2_3_4.guessNumber;

import java.util.Arrays;

public class Player {
    private String name;
    private int[] attempts = new int[10];
    int numberOfAttempts = 0;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getNumber(int index) {
        return attempts[index];
    }

    void setAttempt(int index, int num) {
        attempts[index] = num;
    }

    public int[] getAttemps(int index) {
        return Arrays.copyOf(attempts, index);
    }

    public void clear(Player player) {
        Arrays.fill(attempts, 0, player.numberOfAttempts, 0);
    }
}