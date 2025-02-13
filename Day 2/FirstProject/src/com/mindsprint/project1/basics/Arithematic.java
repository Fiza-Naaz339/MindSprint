package com.mindsprint.project1.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Arithematic {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Addition: "+(num1+num2));
        System.out.println("Subtraction: "+(num1-num2));
        System.out.println(num1+"*"+num2+"= "+(num1*num2));
        System.out.println(num1+"/"+num2+"= "+(num1/num2));

    }
}
