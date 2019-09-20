package com.orte.pattern.decorator;

public class Main {
    public static void main(String[] args) {
        Component windowWithBorder = new BorderDecorator(new Window());
        windowWithBorder.draw();
        Component justWindow = new Window();
        justWindow.draw();
        Component windowColored = new ColorDecorator(windowWithBorder);
        windowColored.draw();

    }
}
