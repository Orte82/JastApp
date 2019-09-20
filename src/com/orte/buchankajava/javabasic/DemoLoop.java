package com.orte.buchankajava.javabasic;

public class DemoLoop {
    public static void main(String[] args) {
        VampireKing gugo = new VampireKing("Gugo");


        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOR, 183));
        conan.pickUpLoot(new Loot("Ring of Speed", LootType.RING, 24));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventry();

        System.out.println(conan.score());




    }
}
