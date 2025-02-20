package FirstProject.src.com.mindsprint.project1.Abstraction;

public class Api1 implements Paypal {
    @Override
    public void pay(String method) {
        if (method.equals("Paypal")) {
            System.out.println("Payment done using PayPal");
        }
    }
}
