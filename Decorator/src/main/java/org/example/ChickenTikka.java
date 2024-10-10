package org.example;

public class ChickenTikka extends Pizza{
    public ChickenTikka(){
        description = "ChickenTikka";
    }
    @Override
    public int getCost() {
        return 180;
    }
}
