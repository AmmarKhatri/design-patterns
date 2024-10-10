package org.example;

public class Main {
    public static void main(String[] args) {
        OS category = OS.Android;
        //Getting our UI
        UIFactory factory;
        if (category == OS.IOS){
            factory = new iOSFactory();
        } else {
            factory = new AndroidFactory();
        }
        UI ui = new UI(factory);
        ui.renderUI();
    }
}