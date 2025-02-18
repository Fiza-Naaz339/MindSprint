package com.mindsprint.project1.Arrays;

import java.util.Scanner;


public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] names = {"test1","test2"};

        System.out.println("Access Direct: "+names[0]);
        System.out.println("Using For Loop");
        for(int i=0;i< names.length;i++)
            System.out.println(names[i]);
        System.out.println("Using For each Loop");
        for (String name:names)
            System.out.println(name);
        System.out.println("Store values in array using loop");
        for (int i=0;i< arr.length;i++){
            System.out.print("Enter any number: ");
            arr[i] = sc.nextInt();
        }
        for(int num:arr)
            System.out.print(num+ " ");
    }
}
