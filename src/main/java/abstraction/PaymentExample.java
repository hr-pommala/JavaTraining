package abstraction;

abstract class Payment {
    // Abstract method
    abstract void processPayment(double amount);

    // Concrete method
    public void paymentDetails() {
        System.out.println("Payment is being processed...");
    }
}

class CreditCardPayment extends Payment {
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment of " + amount);
    }
}

class PayPalPayment extends Payment {
    public void processPayment(double amount) {
        System.out.println("Processing PayPal payment of " + amount);
    }
}

public class PaymentExample {
	
    public static void main(String[] args) {
    	
        Payment payment1 = new CreditCardPayment();
        Payment payment2 = new PayPalPayment();

        payment1.paymentDetails();
        payment1.processPayment(100.50);

        payment2.paymentDetails();
        payment2.processPayment(200.75);
    }
}

