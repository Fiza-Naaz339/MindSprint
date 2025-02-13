package com.mindsprint.project1.inheritance;

public class MethodOverload {
    public int add(int num1,int num2){
        return num1+num2;
    }
    public int add(int num1,int num2,int num3){
        return num1+num2+num3;
    }
    public double add(double num1, double num2){
        return num1+num2;
    }
    public float add(float num1,float num2){
        return num1+num2;
    }

    public static void main(String[] args) {
        MethodOverload m = new MethodOverload();
        System.out.println(m.add(6.7,8.9));
        System.out.println(m.add(23,89));
        System.out.println(m.add(3.4f,4.3f));
    }
}
