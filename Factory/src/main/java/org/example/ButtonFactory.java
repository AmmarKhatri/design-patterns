package org.example;

enum OS {
    ANDROID,
    IOS
}

public class ButtonFactory {
    public static Button createButton(OS type) {
        switch (type) {
            case ANDROID:
                return new AndroidButton();
            case IOS:
                return new iOSButton();
            default:
                throw new IllegalArgumentException("Unsupported OS type: " + type);
        }
    }
}
