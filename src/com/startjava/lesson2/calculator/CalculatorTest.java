package com.startjava.lesson2.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class CalculatorTest {
    public static void main(String[] args)  throws IOException {
        String answer = "да";
        while(answer.equals("да")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            Calculator calc = new Calculator();
            System.out.print("Введите первое число: ");
            int num1 = Integer.parseInt(reader.readLine());
            System.out.print("Введите знак математической операции: ");
            String sign = reader.readLine();
            System.out.print("Введите второе число: ");
            int num2 = Integer.parseInt(reader.readLine());
            int result = calc.calculate(num1, sign, num2);
            System.out.println(num1 + sign + num2 + " = " + result);
        
            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = reader.readLine();
                if(answer.equals("да")) {
                    break;
                } else if (answer.equals("нет")) {
                    break; 
                }
            } while (true);
        }
    }
}