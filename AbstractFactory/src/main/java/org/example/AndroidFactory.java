package org.example;

public class AndroidFactory implements UIFactory{
    public Button createButton(){
        return new AndroidButton();
    }

    @Override
    public DialogBox createDialogBox() {
        return new AndroidDialogBox();
    }
}
