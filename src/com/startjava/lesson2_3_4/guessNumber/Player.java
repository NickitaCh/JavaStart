package com.startjava.lesson2_3_4.guessNumber;

public class Player {
    private String name;
    private int number;
    private int[] num = new int[10];

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

    void setNum (int index, int num) {
        this.num[index] = num;
    }

    public int[] getNum() {
        return num;
    }
}