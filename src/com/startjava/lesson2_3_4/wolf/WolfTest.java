package com.startjava.lesson2_3_4.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf wolfOne = new Wolf();
        wolfOne.setSex('M');
        wolfOne.setName("Baron");
        wolfOne.setWeight(4.3);
        wolfOne.setAge(3);
        wolfOne.setColor("Grey");
        
        System.out.println(wolfOne.getSex());
        System.out.println(wolfOne.getName());
        System.out.println(wolfOne.getWeight());
        System.out.println(wolfOne.getAge());
        System.out.println(wolfOne.getColor());

        wolfOne.walk();
        wolfOne.sit();
        wolfOne.run();
        wolfOne.howl();
        wolfOne.hunt();
    }
}