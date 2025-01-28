package strategy;

// Strategy design pattern
// The Strategy design pattern is used to define a family of algorithms, encapsulate each one, and make them interchangeable dynamically.
public class StrategyDesign {

    public static void main(String[] args) {
        // passing payment methods dynamically
        PaymentContext cashPayment = new PaymentContext(new CashPaymentStrategy());
        PaymentContext cardPayment = new PaymentContext(new CardPaymentStrategy());
        PaymentContext upiPayment = new PaymentContext(new UpiPaymentStrategy());
        PaymentContext paypalPayment = new PaymentContext(new PaypalPaymentStrategy());

        // using payment methods
        // Pay using cash
        cashPayment.pay(100.0);

        // Pay using card
        cardPayment.pay(200.0);

        // Pay using UPI
        upiPayment.pay(300.0);

        // Pay using PayPal
        paypalPayment.pay(400.0);
    }
}

// Step 1: Create the Strategy interface
interface PaymentStrategy {
    void pay(double amount);
}

// Step 2: Create concrete classes that implement the Strategy interface

// Cash Payment Strategy
class CashPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with cash: " + amount);
    }
}

// Card Payment Strategy
class CardPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with card: " + amount);
    }
}

// UPI Payment Strategy
class UpiPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with UPI: " + amount);
    }
}

// Paypal Payment Strategy
class PaypalPaymentStrategy implements PaymentStrategy {

    @Override
    public void pay(double amount) {
        System.out.println("Paying with Paypal: " + amount);
    }
}

// Step 3: Create the Context class
class PaymentContext {

    private final PaymentStrategy paymentStrategy;
    // Dependency injection
    // Passing payment methods dynamically
    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    // Execute the payment using the current strategy
    public void pay(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy not set!");
        }
        paymentStrategy.pay(amount);
    }
}