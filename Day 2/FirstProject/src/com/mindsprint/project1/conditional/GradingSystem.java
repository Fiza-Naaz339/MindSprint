package com.mindsprint.project1.conditional;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int percentage = sc.nextInt();
        if(percentage>=70 && percentage<=100)
            System.out.println("Congratullations..!! You got Distinction");
        else if (percentage>=60 && percentage<70)
            System.out.println("Congratullations..!! You got First class");
        else if (percentage>=50 && percentage<60)
            System.out.println("Congratullations..!! You got Second class");
        else if (percentage>=35 && percentage<50)
            System.out.println("Congratullations..!! You got Pass class");
        else if (percentage>=00 && percentage<35)
            System.out.println("Sorry You Failed");
        else
            System.out.println("Kindly enter the correct percentage");
    }
}
