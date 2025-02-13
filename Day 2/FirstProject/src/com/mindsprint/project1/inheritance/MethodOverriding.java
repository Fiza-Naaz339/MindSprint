package com.mindsprint.project1.inheritance;

class ParentPhone{
    public void call(){
        System.out.println("Parent phone is calling");
    }
}
class ChildPhone extends ParentPhone{
    public void call(){
        super.call();
        System.out.println("Child is calling");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        ChildPhone alex = new ChildPhone();
        alex.call();

    }
}
