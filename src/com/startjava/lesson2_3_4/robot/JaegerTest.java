package com.startjava.lesson2_3_4.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger jaeger1 = new Jaeger();
        jaeger1.setModelName("Cherno Alpha");
        jaeger1.setMark("Mark-1");
        jaeger1.setOrigin("Russia");
        jaeger1.setHeight(85.34);
        jaeger1.setWeight(2.412);
        jaeger1.setSpeed(3);
        jaeger1.setStrength(10);
        jaeger1.setArmor(10);

        System.out.println(jaeger1.getModelName());
        System.out.println(jaeger1.getMark());
        System.out.println(jaeger1.getOrigin());
        System.out.println(jaeger1.getHeight() + " m");
        System.out.println(jaeger1.getWeight() + " tons");
        System.out.println(jaeger1.getSpeed());
        System.out.println(jaeger1.getStrength());
        System.out.println(jaeger1.getArmor());
        System.out.println("");

        Jaeger jaeger2 = new Jaeger();
        jaeger2.setModelName("Striker Eureka");
        jaeger2.setMark("Mark-5");
        jaeger2.setOrigin("Australia");
        jaeger2.setHeight(76.2);
        jaeger2.setWeight(1.850);
        jaeger2.setSpeed(10);
        jaeger2.setStrength(10);
        jaeger2.setArmor(9);

        System.out.println(jaeger2.getModelName());
        System.out.println(jaeger2.getMark());
        System.out.println(jaeger2.getOrigin());
        System.out.println(jaeger2.getHeight() + " m");
        System.out.println(jaeger2.getWeight() + " tons");
        System.out.println(jaeger2.getSpeed());
        System.out.println(jaeger2.getStrength());
        System.out.println(jaeger2.getArmor());
    }
}