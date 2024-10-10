package org.example;

public class iOSDialogBox implements DialogBox{
    //private so no one can initialize directly
    public iOSDialogBox(){}
    @Override
    public DialogBox render() {
        System.out.println("Rendering my iOS dialog box");
        return new iOSDialogBox();
    }
}
