package com.mindsprint.project1.basics;

import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("selling price:");
        int selling = sc.nextInt();

        System.out.println("Purchase price:");
        int purchase = sc.nextInt();

        int profit = selling-purchase;
        int loss = purchase - selling;
        String result = (selling>purchase)?"profit "+profit:"loss "+loss;
        System.out.println(result);
    }
}
