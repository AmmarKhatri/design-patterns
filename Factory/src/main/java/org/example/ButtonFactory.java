package org.example;
enum OS {
    Android,
    IOS
}
public class ButtonFactory {
    public static Button Create(OS type){
        if (type == OS.Android){
            return new AndroidButton();
        } else if (type == OS.IOS){
            return new iOSButton();
        }
        return null;
    }
}
