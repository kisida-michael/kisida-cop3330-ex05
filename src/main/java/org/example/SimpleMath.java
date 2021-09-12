package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Michael Kisida
 */
import java.util.Scanner;
public class SimpleMath
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);  // Create a Scanner object
        System.out.print("What is the first number? ");
        String num1Str = input.nextLine();  // Read user input
        System.out.print("What is the second number? ");
        String num2Str  = input.nextLine();  // Read user input
        int num1 = Integer.parseInt(num1Str);
        int num2 = Integer.parseInt(num2Str);
        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 *  num2;
        int div = num1 / num2;
        String output = String.format("%d + %d = %d\n%d - %d = %d\n%d * %d = %d\n%d / %d = %d", num1, num2, add, num1, num2, sub,num1, num2, mul, num1, num2, div);
        System.out.println(output);
        input.close();
    }
}
