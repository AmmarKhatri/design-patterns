package org.example;

class FreshTomato extends ToppingsDecorator {
    // We need a reference to the object we are decorating
    Pizza pizza;

    public FreshTomato(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getDescription() {
        return pizza.getDescription() + ", Fresh Tomato";
    }

    public int getCost() {
        return 40 + pizza.getCost();
    }
}