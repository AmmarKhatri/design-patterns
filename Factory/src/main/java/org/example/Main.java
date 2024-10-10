package org.example;

public class Main {
    public static void main(String[] args) {
        // Creating a UI for iOS
        UI ui = new UI(OS.IOS);
        Button myButton = ui.getButton();
        myButton.render(); // Prints: "Rendering my iOS button"

        // Creating a UI for Android
        UI androidUI = new UI(OS.ANDROID);
        Button androidButton = androidUI.getButton();
        androidButton.render(); // Prints: "Rendering my Android button"
    }
}
