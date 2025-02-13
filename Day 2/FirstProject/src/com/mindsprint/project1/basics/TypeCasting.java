package com.mindsprint.project1.basics;

import org.w3c.dom.ls.LSOutput;

public class TypeCasting {
    public static void main(String[] args){
    short data = 10;
    float data1=data;
    System.out.print("Data1: "+data1);

    double info = 78.78;
    int info1 = (int) info;
    System.out.println("Info: "+info1);

    String a ="A";
    //System.out.println("ASCII No: "+(int)a);
    //System.out.println("Info: "+(char)(int)a+32);

}
}
