package com.orte.javahowtostart;

public class Recursion2 {
    public static void recursion(int num){
        num--;
        System.out.println("First half of method recursion: " + num   );
        if(num!=0){
            callRecursion(num);
        }
        System.out.println("Second half of method recursion: " + num );
    }
    public static void callRecursion(int num){
        System.out.println("Second half of method callRecursion: " + num );
        recursion(num);
        System.out.println("Second half of method callRecursion: " + num );
    }

    public static void main(String[] args) {
        callRecursion(5);
    }
}
