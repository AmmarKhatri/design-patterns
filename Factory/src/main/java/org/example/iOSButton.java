package org.example;

public class iOSButton implements Button{
    //private so no one can initialize directly
    public iOSButton(){}
    @Override
    public Button render() {
        System.out.println("Rendering my iOS button");
        return new iOSButton();
    }
}
