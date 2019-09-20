package com.orte.buchankajava.javabasic;

public class Demo {

    public static void main(String[] args) {
        Player tim = new Player("Alexis", 8);
//        System.out.println(tim.getHandleName());
//        tim.setHandleName("Timothy");
//        System.out.println(tim.getHandleName());
//        System.out.println(tim.getWeapon().getName());
//        Weapon timsWeapon = tim.getWeapon();
//        System.out.println(timsWeapon.getName().toUpperCase());
        System.out.println(tim.getWeapon().getName());

        Weapon myAxe = new Weapon("Gold Axe",15,50);
        tim.setWeapon(myAxe);
        tim.setWeapon(new Weapon("SuperAxe", 10, 100));
        System.out.println(tim.getWeapon().getName());

        Loot redPotion = new Loot("Red Potion", LootType.POTION,7);
        tim.pickUpLoot(redPotion);

        tim.pickUpLoot(new Loot("+3 Cheast Armor", LootType.ARMOR,80));
        tim.pickUpLoot(new Loot("Golden ring", LootType.RING, 100));

        tim.showInventry();

        //Loot bluePotion = new Loot("Blue Potion", LootType.POTION, 6);

        boolean wasDeleted = tim.dropLoot(redPotion);
        System.out.println(wasDeleted);
        tim.showInventry();
    }
}
