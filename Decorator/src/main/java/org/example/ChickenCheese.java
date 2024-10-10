package org.example;

public class ChickenCheese extends Pizza{
    public ChickenCheese(){
        description = "ChickenCheese";
    }
    @Override
    public int getCost() {
        return 100;
    }
}
