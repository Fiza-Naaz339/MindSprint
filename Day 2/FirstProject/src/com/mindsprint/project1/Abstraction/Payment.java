package com.mindsprint.project1.Abstraction;

import java.util.Scanner;



interface Paypal{
    public void pay();
}
interface Razorpay{
    public void pay();
}
public class Api1 implements Paypal{
    @Override
    public void pay(){
        if(method.equals("Paypal"))
            System.out.println("Payment done using PayPal");
    }
}
public class Api2 implements Razorpay{
    @Override
    public void pay(){
        if(method.equals("Razorpay"))
            System.out.println("Payment done using Razorpay");
    }
}
public class Payment{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select yor payment method:");
        String method = sc.next();
        if(method.equals("Razorpay")) {
            Razorpay rp = new Api2();
            rp.pay();
        }
        else{
            Paypal pal = new Api1();
            pal.pay();
        }
    }

}
