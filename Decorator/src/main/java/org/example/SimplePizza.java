package org.example;

public class SimplePizza extends Pizza{
    public SimplePizza(){
        description = "SimplePizza";
    }
    @Override
    public int getCost() {
        return 50;
    }
}
