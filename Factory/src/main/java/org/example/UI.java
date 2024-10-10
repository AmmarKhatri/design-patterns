package org.example;

public class UI {
    private final Button button;
    public UI(OS type){
        button = ButtonFactory.Create(type);
    }

    Button getButton(){
        return button;
    }
}
