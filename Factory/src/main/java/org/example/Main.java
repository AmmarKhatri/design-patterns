package org.example;

public class Main {
    public static void main(String[] args) {
        //Getting our UI
        UI ui = new UI(OS.IOS);
        Button myButton = ui.getButton();
        myButton.render();
    }
}