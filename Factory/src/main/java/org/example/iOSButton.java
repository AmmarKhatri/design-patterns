package org.example;

public class iOSButton implements Button {
    public iOSButton() {} // Default constructor

    @Override
    public void render() {
        System.out.println("Rendering my iOS button");
    }
}
