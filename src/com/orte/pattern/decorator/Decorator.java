package com.orte.pattern.decorator;

public abstract class Decorator implements Component{
    private Component component;
    public Decorator(Component component){
        this.component = component;
    }

    public abstract void afterDraw();
    @Override
    public void draw() {
        component.draw();
        afterDraw();
    }
}
