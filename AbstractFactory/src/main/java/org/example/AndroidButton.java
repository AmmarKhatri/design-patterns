package org.example;

public class AndroidButton implements Button{
    //private so no one can initialize directly
    public AndroidButton(){}
    @Override
    public Button render() {
        System.out.println("Rendering my Android button");
        return new AndroidButton();
    }
}
