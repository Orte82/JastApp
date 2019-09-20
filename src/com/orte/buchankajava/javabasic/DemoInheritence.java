package com.orte.buchankajava.javabasic;

public class DemoInheritence {

    public static void main(String[] args) {
//        Enemy enemy = new Enemy("test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();

        Troll uglyTroll = new Troll("Ugly Troll");
        uglyTroll.showInfo();
        uglyTroll.takeDamage(30);

        Vampire vlad = new Vampire("Vlad");
        vlad.showInfo();
        vlad.takeDamage(8);
        vlad.showInfo();


        VampireKing farah = new VampireKing("Farah");
        farah.showInfo();

        while (farah.getLives() > 0) {
            if(farah.dodges()){
                continue;
            }
            if (farah.runAway()) {
                System.out.println("Farah ran away");
                break;
            } else {
                farah.takeDamage(12);
                farah.showInfo();
            }
        }
    }
}
