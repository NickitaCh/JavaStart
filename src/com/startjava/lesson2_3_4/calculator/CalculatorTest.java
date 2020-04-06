package com.startjava.lesson2_3_4.calculator;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class CalculatorTest {
    public static void main(String[] args)  throws IOException {
        String answer = "да";
        while(answer.equals("да")) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Введите математическое выражение: ");
            String Str = new String(reader.readLine());
            String[] math = Str.split(" ");

            Calculator calc = new Calculator();
            int num1 = Integer.parseInt(math[0]);
            int num2 = Integer.parseInt(math[2]);
            String sign = math[1];
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