package com.orte.javaprofessional.serialization.example1.classWithoutImplements;

import java.io.Serializable;

public class Bmw extends Car implements Serializable {
    private int price;
    private  String model;
    private  Engine engine;
    // private transient Engine engine;
    Bmw(int weight, int price , String model, Engine engine){
        super(weight);
        this.price = price;
        this.model= model;
        this.engine= engine;
        System.out.println("Child Constructor");
    }

    @Override
    public String toString() {
        return "Bmw{" +
                "price=" + price +
                "weight=" + this.getWeight() +
                ", model='" + model + '\'' +
                ", engine=" + engine +
                '}';
    }
}
class Engine implements Serializable{
    private int power;
    private String producer;

    public Engine(int power, String producer) {
        this.power = power;
        this.producer = producer;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", producer='" + producer + '\'' +
                '}';
    }
}
abstract class Car implements Serializable{
    private int weight;

    Car(){
        System.out.println("Parent Constructor");
    }

    public Car(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                '}';
    }

    public int getWeight() {
        return weight;
    }
}
