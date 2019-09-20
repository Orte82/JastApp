package com.orte.buchankajava.interfaces;

public class InnerClassExample {

    public static void main(String[] args) {
        GearBoxNew mcLaren = new GearBoxNew(6);
//        GearBoxNew.Gear first = mcLaren.new Gear(1, 12.);
//        GearBoxNew.Gear second = new GearBoxNew.Gear(2,15.4);
//        GearBoxNew.Gear third = new mcLaren.Gear(3, 17.8);
//        System.out.println(first.driveSpeed(1000));


        mcLaren.operateClutch(true);
        mcLaren.changeGear(1);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(1000));
        mcLaren.changeGear(2);
        System.out.println(mcLaren.wheelSpeed(3000));
        mcLaren.operateClutch(true);
        mcLaren.changeGear(3);
        mcLaren.operateClutch(false);
        System.out.println(mcLaren.wheelSpeed(6000));


    }
}
