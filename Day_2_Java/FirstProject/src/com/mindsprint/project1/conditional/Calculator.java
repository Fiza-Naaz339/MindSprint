package com.mindsprint.project1.conditional;
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter a number2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operator: ");
        System.out.println("Addition: +\nSubtraction: -\nMultiplication: *\nDivision: /");
        String operator = sc.next();
        switch (operator){
            case "+":
                System.out.println("Addition: "+(num1+num2));
                break;
            case "-":
                System.out.println("Addition: "+(num1-num2));
                break;
            case "*":
                System.out.println("Addition: "+(num1*num2));
                break;
            case "/":
                System.out.println("Addition: "+(num1/num2));
                break;
            default:
                System.out.println("kindly enter the correct option");
        }
    }
}
