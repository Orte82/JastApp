package com.orte.javaprofessional.serialization.example1.serialization;

import java.io.Serializable;

public class Car implements Serializable {
    private int price;
    private String mode;

    public Car(int price, String mode) {
        this.price = price;
        this.mode = mode;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", mode='" + mode + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }
}
