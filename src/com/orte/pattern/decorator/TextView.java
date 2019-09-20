package com.orte.pattern.decorator;

public class TextView implements Component {
    @Override
    public void draw() {
        System.out.println("Draw textView");
    }
}
