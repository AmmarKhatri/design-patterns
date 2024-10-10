package org.example;

public class Farmhouse extends Pizza{
    public Farmhouse(){
        description = "Farmhouse";
    }
    @Override
    public int getCost() {
        return 150;
    }
}
