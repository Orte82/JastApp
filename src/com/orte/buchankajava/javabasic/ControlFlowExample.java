package com.orte.buchankajava.javabasic;

public class ControlFlowExample {
    public static void main(String[] args) {
        int lives =3;

        if(lives < 1){
            System.out.println("Game over!");
        }else{
            System.out.println("You'are still alive!");
        }
        boolean isGameOver = (lives<1);
        if(isGameOver){
            System.out.println("Game over!");
        }else{
            System.out.println("You'are still alive!");
        }
    }
}
