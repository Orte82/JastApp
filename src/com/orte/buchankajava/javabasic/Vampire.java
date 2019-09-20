package com.orte.buchankajava.javabasic;

public class Vampire extends Enemy {
    public Vampire(String name) {
        super(name, 20, 3);
    }

    @Override
    public void takeDamage(int damage) {
        int damageDone = (damage/2);
        super.takeDamage(damageDone);
    }


//    @Override
//    public void takeDamage(int damage) {
//        int hitPoints = getHitPoints();
//        hitPoints = hitPoints -(damage/2);
//        setHitPoints(hitPoints);
    //}
}
