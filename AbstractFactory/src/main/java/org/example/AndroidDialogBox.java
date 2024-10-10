package org.example;

public class AndroidDialogBox implements DialogBox{
        //private so no one can initialize directly
        public AndroidDialogBox(){}
        @Override
        public DialogBox render() {
            System.out.println("Rendering my Android dialog box");
            return new AndroidDialogBox();
        }
    }
