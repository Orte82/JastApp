package com.orte.pattern.factory;

public class CarSelector {
    public static CarSelector instance;

    public static CarSelector getInstance() {
        if (instance == null) {
            instance = new CarSelector();
        }
        return instance;

    }

    private CarSelector() {
    }
    public Car getCar(RoadType roadType){
        Car car = null;
        switch (roadType){
            case CITY:
                car = new Porshe();
                break;
            case OFF_ROAD:
                car = new Jeep();
                break;
            case MOUNTAINS:
                car = new NewJeep();
                break;
        }
        return car;
    }
}
