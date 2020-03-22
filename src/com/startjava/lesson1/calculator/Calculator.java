package com.startjava.lesson1.calculator;

public class Calculator {
    public static void main(String[] args) {
        int a = 55;
        int b = 5;
        char sign = '^';
        
        if (sign == '+') {
            System.out.println(a + " + " + b + " = " + (a + b));
        } else if (sign == '-') {
            System.out.println(a + " - " + b + " = " + (a - b));
        } else if (sign == '*') {
            System.out.println(a + " * " + b + " = " + (a * b));
        } else if (sign == '/') {
            System.out.println(a + " / " + b + " = " + (a / b));
        } else if (sign == '^') {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result += result * a;
            }
            System.out.println(a +" ^ "+ b + " = " + result);
        } else if (sign == '%') {
            System.out.println(a + " % " + b + " = " + (a % b));
        }
    }
}