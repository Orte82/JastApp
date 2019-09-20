package com.orte.pattern.decorator;

public class Window implements Component{
    @Override
    public void draw() {
        System.out.println("Draw window");
    }
}
