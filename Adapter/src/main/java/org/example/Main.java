package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Create instances of PayPal and Stripe
        PaymentGateway paypalGateway = new PayPalAdapter(new PayPal());
        PaymentGateway stripeGateway = new StripeAdapter(new Stripe());

        double amount = 100.0;

        // Process payments using different payment gateways
        paypalGateway.processPayment(amount);
        stripeGateway.processPayment(amount);
    }
}