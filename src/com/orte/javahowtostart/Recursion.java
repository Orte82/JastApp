package com.orte.javahowtostart;

public class Recursion {
    public static void recursion(int num){
        num--;
        System.out.println("First half of method: " + num   );
        if(num!=0){
            recursion(num);
        }
        System.out.println("Second half of method: " + num );
    }
    public static void main(String[] args) {
        recursion(5);
    }
}
