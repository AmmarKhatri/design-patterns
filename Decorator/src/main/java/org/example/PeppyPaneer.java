package org.example;

public class PeppyPaneer extends Pizza{
    public PeppyPaneer(){
        description = "Peppy Paneer";
    }
    @Override
    public int getCost() {
        return 100;
    }

}
