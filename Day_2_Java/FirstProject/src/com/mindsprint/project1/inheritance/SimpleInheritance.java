package com.mindsprint.project1.inheritance;

class Parent{
    public String name = "Test";
    public Parent(){

    }
    public void hello(){
        System.out.println("Hello from parents");
    }
}
class Child extends Parent{
    public Child(){
        super();//Calling parent class constructor
        System.out.println("Child Constructor");
    }
    public void print(){
        System.out.println("Welcome: "+name);//Child can access properties of parent
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        Child child = new Child();
        child.print();//Child can access method of parent class
        child.hello();
        System.out.println(child.name);//Direct access
    }
}
