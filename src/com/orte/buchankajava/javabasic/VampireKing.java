package com.orte.buchankajava.javabasic;

import java.util.Random;

public class VampireKing extends Vampire {

    public VampireKing(String name) {
        super(name);
        super.setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        int damageHalf = damage / 2;
        super.takeDamage(damageHalf);
    }

    public boolean runAway() {
        if (getLives() < 2) {
            return true;
        } else {
            return false;
        }
    }

    public boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if(chance>3){
            System.out.println("King dodges");
            return true;
        }
        return false;
    }
}
