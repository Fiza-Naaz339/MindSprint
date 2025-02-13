package com.mindsprint.project1.inheritance;

class Base{
    int num;
    Base(int num){
        this.num = num;
    }
}
class Derived extends Base{
    Derived(int data){
        super(data);
    }
}
public class TestSuper {
    public static void main(String[] args) {
        Derived d = new Derived(89);
        System.out.println(d.num);//Num is the variable declared in parent class

    }
}
