package com.orte.pattern.decorator;

public class BorderDecorator extends Decorator{

    public BorderDecorator(Component component){super(component);}
    public void afterDraw() {
        System.out.println("... add border");
    }
}
