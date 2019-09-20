package com.orte.javaessential.classdeclaration;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();

        System.out.println(shape.b);  // false
        System.out.println(shape.c); // " "
        System.out.println(shape.f);  // 0.0
        System.out.println(shape);  // com.orte.javaessential.classdeclaration.Shape@5b6f7412

        shape.square = 24.0;
        System.out.println(shape.square);


        shape.setHeight(200);
        shape.getHeight();

        //shape.viewShape();
        shape.setLength(144);
        shape.getLength();
    }
}
