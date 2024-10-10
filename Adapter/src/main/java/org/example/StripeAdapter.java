package org.example;

public class StripeAdapter implements PaymentGateway {
    private Stripe paymentGateway;

    public StripeAdapter(Stripe paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    @Override
    public void processPayment(double amount) {
        // Convert our application's method to Stripe's method
        paymentGateway.charge(amount);
    }
}