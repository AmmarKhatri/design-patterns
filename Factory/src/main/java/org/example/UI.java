package org.example;

public class UI {
    private final Button button;

    public UI(OS type) {
        button = ButtonFactory.createButton(type);
    }

    public Button getButton() {
        return button;
    }
}
