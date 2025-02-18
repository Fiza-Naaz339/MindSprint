package com.mindsprint.project1.basics;
import java.util.Scanner;

public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter age:");
        int age = sc.nextInt();

        String result = (age>=18)?"true":"false";
        System.out.println(result);
    }
}
