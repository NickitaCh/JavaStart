package com.startjava.lesson2_3_4.guessNumber;

public class Player {
    private String name;
    private int number;
    int num[] = new int[10];

    public Player(String name) {
        this.name = name;
    }

    void setName(String name) {
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


}