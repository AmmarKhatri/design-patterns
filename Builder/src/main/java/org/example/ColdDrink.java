package org.example;

// ColdDrink.java
public abstract class ColdDrink implements Item {
    @Override public Packing packing() {
        return new Bottle();
    }
    @Override public abstract float price();
    @Override public abstract String name();
}

