package org.example;

public class AndroidButton implements Button {
    public AndroidButton() {} // Default constructor

    @Override
    public void render() {
        System.out.println("Rendering my Android button");
    }
}
