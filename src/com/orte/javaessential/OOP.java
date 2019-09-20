package com.orte.javaessential;

import java.io.IOException;

public class OOP {
    // Объе́ктно-ориенти́рованное программи́рование (ООП) — методология программирования, основанная на представлении
    // программы в виде совокупности объектов, каждый из которых является экземпляром определенного класса,
    // а классы образуют иерархию наследования.

    // Encapsulation
    // Inheritance
    // Polymorphism

    // Abstraction - simplify code while hiding implementation
    // Абстракция - придание объекту характеристик которые отличают его от всех других объектов и придают ему
    // концептуальные границы
    // Абстрагирование - это способ выделить набор заначимых характеристик исключая из рассмотрения незначимые.
    // абстракция - это набор таких характеристик.

    // Полиморфизм - возможность объектов с одинаковой спецификацией иметь различную реализацию
    // Перевод ;)

    // Наследование - механизм ООП позволяющий описать новый класс на основе уже существнующего.


    // Encapsulation
    // language mechanic which helps to prevent access from one component of program to another

    // Access modifiers in Java
    // private - class members are accessed only within class to which they belong
    // default(package-private) - class members are seen only inside package
    // protected - class members are seen only inside package and by descendants
    // public - class members are accessed by every other program components
    class A {
        private int field1;
        int field2;
        protected int field3;
        public int field4;
    }

//    Ассоциация
//    Агрегация и композиция
//    Обобщение/Расширение (наследование)


    // primitives and references are stored in stack
    // objects are stored in heap

    // !!! Class fields with primitive value are initialized with default value if not set in init faze of object creation;
    // Method variables including main method must be initialised manually;


}
