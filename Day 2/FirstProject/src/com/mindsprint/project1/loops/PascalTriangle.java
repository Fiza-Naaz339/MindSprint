package com.mindsprint.project1.loops;

public class PascalTriangle {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for Pascal's Triangle
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(binomialCoeff(i, j) + " ");
            }
            System.out.println();
        }
    }

    // Function to calculate binomial coefficient
    static int binomialCoeff(int n, int k) {
        int res = 1;
        if (k > n - k) {
            k = n - k;
        }
        for (int i = 0; i < k; ++i) {
            res *= (n - i);
            res /= (i + 1);
        }
        return res;
    }
}
