package com.orte.buchankajava.javabasic;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventry;

    public Player() {

        this("Unknown player");
    }

    public Player(String handleName) {
        this(handleName,1);
    }

    public Player(String handleName, int startingLevel) {
        setHandleName(handleName);
        setLives(3);
        setLevel(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventry = new ArrayList<>();
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public String getHandleName() {
        return handleName;
    }

    public void setHandleName(String handleName) {
        if (handleName.length() < 4) {
            return;
        }
        this.handleName = handleName;
        setDefaultWeapon();
    }

    private void setDefaultWeapon() {
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Loot> getInventry() {
        return inventry;
    }

    public void setInventry(ArrayList<Loot> inventry) {
        this.inventry = inventry;
    }

    public void pickUpLoot(Loot newLoot) {
        inventry.add(newLoot);
    }

    public boolean dropLoot(Loot loot) {
        if (this.inventry.contains(loot)) {
            inventry.remove(loot);
            return true;
        }
        return false;
    }

    public void showInventry() {
        for (Loot item : inventry) {
            System.out.println(item.getName());
        }
        System.out.println("=========================");
    }

    public int score() {
        int total = 0;
//        for (int i = 0; i < inventry.size(); i++) {
        for(Loot currentLoot:inventry){
//            Loot currentLoot = inventry.get(i);
            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue() );
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
