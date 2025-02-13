package com.mindsprint.project1.Arrays;

import java.util.Scanner;

public class TwoDArary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] array1 = new int[3][];
        int[][] array = {{1,2,3},{4,5,6}};
        for (int i=0;i<array.length;i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Access using For Each");
        for(int[] arr:array) {
            for (int num : arr) {
                System.out.print(num + "\t");
            }
            System.out.println();
        }

    }
}
