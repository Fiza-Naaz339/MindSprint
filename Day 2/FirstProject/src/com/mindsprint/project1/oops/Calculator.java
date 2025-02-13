package com.mindsprint.project1.oops;

public class Calculator {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int sub(int num1,int num2){
        return num1-num2;
    }
    public int mul(int num1,int num2){
        return num1*num2;
    }
    public int div(int num1,int num2){
        return num1/num2;
    }
    public int sqr(int num){
        return num*num;
    }
    public int cube(int num){
        return num*num*num;
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println("Addition: "+c.add(43,23));
        int result = c.cube(3);
        System.out.println("Cube of 3 is "+result);
    }
}
