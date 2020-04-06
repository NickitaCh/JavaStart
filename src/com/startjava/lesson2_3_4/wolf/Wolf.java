package com.startjava.lesson2_3_4.wolf;

public class Wolf {
    private char sex = 'M';
    private String name = "Nik";
    private double weight = 10.0;
    private int age = 22;
    private String color = "black";

    public char getSex() {
        return sex;
    }

    void setSex(char sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    void setAge(int age) {
        if(age > 8) {
            System.out.println("Некорректный возраст");
        } else {
            this.age = age;
        } 
    }

    public String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    public void walk() {
        
    }

    public boolean sit() {
        return true;
    }

    public void run() {

    }

    public boolean howl() {
        return true;
    }

    public void hunt() {

    }
}