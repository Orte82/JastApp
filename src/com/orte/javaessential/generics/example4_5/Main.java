package com.orte.javaessential.generics.example4_5;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();

        IContainer<Circle> container = new Container<>(circle);

        System.out.println(container.getFigure().toString()); //com.orte.javaessential.generics.example4.Circle@6e8cf4c6

        //Example 5

        Circle circle2 = new Circle();
        IContainer<Shape> container2 = new Container<>(circle2);

        System.out.println(container2.getFigure().toString()); //com.orte.javaessential.generics.example4.Circle@12edcd21

    }

}

abstract class Shape {
}

class Circle extends Shape {
}

interface IContainer<T> {
    T getFigure();

    void setFigure(T figure);
}

class Container<T> implements IContainer<T> {
    private T figure;

    public Container(T figure) {
        this.figure = figure;
    }

    @Override
    public T getFigure() {
        return figure;
    }

    @Override
    public void setFigure(T figure) {
        this.figure = figure;
    }


}
