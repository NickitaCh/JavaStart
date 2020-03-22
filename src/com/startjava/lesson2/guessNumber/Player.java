package com.startjava.lesson2.guessNumber;

public class Player {
    private String name;
    private int number;

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