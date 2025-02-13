package com.mindsprint.project1.loops;
import java.util.Scanner;
public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt(); // Number for which the table is to be displayed
        for (int i = 1; i <= number; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}

