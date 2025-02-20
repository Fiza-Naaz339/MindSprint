package FirstProject.src.com.mindsprint.project1.Abstraction;

public class Api2 implements Razorpay {
    @Override
    public void pay(String method) {
        if (method.equals("Razorpay")) {
            System.out.println("Payment done using Razorpay");
        }
    }
}
