package org.example;

public class iOSFactory implements UIFactory{
    public Button createButton(){
        return new iOSButton();
    }

    @Override
    public DialogBox createDialogBox() {
        return new iOSDialogBox();
    }
}
