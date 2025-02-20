package FirstProject.src.com.mindsprint.project1.Abstraction;

import java.util.Scanner;

interface Paypal {
    void pay(String method);
}

interface Razorpay {
    void pay(String method);
}

public class Payment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select your payment method:");
        String method = sc.next();
        if (method.equals("Razorpay")) {
            Razorpay rp = new Api2();
            rp.pay(method);
        } else {
            Paypal pal = new Api1();
            pal.pay(method);
        }
    }
}
