package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Driver class and method
class Main {
    public static void main(String args[]) {
        // Create new ChickenCheese pizza
        Pizza pizza = new ChickenCheese();
        System.out.println(pizza.getDescription() + " Cost: " + pizza.getCost());

        // Create new FarmHouse pizza
        Pizza pizza2 = new Farmhouse();

        // Decorate it with FreshTomato topping
        pizza2 = new FreshTomato(pizza2);

        // Decorate it with Paneer topping
        pizza2 = new Paneer(pizza2);

        System.out.println(pizza2.getDescription() + " Cost: " + pizza2.getCost());
    }
}
