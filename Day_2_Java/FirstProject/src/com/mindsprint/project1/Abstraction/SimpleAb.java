package com.mindsprint.project1.Abstraction;

abstract class Test{
    public abstract void display();
}

public class SimpleAb extends Test{
    @Override
    public void display(){
        System.out.println("Implement Parent Method");
    }

    public static void main(String[] args) {
        Test test = new SimpleAb();
        test.display();
    }
}
