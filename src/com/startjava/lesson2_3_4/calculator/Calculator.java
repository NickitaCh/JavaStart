package com.startjava.lesson2_3_4.calculator;

public class Calculator {

    public int calculate(int num1, String sign, int num2) {
        switch (sign) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                return num1 / num2;
            case "^":
                return (int) Math.pow(num1, num2);
            case "%":
                return (int) Math.IEEEremainder(num1, num2);
        }
        return 0;
    }
}