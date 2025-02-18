package com.mindsprint.project1.loops;
import java.util.Scanner;
public class DoWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
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
        System.out.println("Enter Y to continue press any key to exit");
        String op = sc.next();
        if(op.equals("y") || op.equals("Y"))
            continue;
        else
            break;
        }
    }
}
