package org.example;

public class UI {
    private final Button button;
    private final DialogBox dialogBox;
    public UI(UIFactory factory){
        button = factory.createButton();
        dialogBox = factory.createDialogBox();
    }

    public void renderUI(){
        button.render();
        dialogBox.render();
    }
}
