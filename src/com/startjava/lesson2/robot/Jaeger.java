package com.startjava.lesson2.robot;

public class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private double height;
    private double weight;
    private int speed;
    private int strength;
    private int armor;

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return  modelName;
    }
    
    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getStrength() {
        return strength;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    boolean drift() {
        return false;
    }

    void move() {

    }

    String scanKaiju() {
        return "no";
    }

    void useVortexCannon() {

    }
}