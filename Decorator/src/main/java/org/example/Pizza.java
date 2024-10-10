package org.example;

abstract class Pizza {
    String description;
    public String getDescription() {
        return description;
    }
    public abstract int getCost();
}
