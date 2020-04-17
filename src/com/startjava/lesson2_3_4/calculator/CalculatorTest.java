package com.startjava.lesson2_3_4.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class CalculatorTest {
    public static void main(String[] args)  throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String answer = "да";
        while(answer.equals("да")) {
            System.out.print("Введите математическое выражение: ");
            String srcMathExpression = reader.readLine();
            String[] splitMathExpression = srcMathExpression.split(" ");

            Calculator calc = new Calculator();
            int num1 = Integer.parseInt(splitMathExpression[0]);
            int num2 = Integer.parseInt(splitMathExpression[2]);
            String sign = splitMathExpression[1];
            int result = calc.calculate(num1, sign, num2);
            System.out.println(num1 + sign + num2 + " = " + result);

            do {
                System.out.print("Хотите продолжить? [да/нет]: ");
                answer = reader.readLine();
            } while (!answer.equals("да") && !answer.equals("нет"));
        }
    }
}