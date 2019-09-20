package com.orte.javahowtostart;

//import stati java.lang.Math.*;
public class MathMethods {
    public static void main(String[] args) {
        int a = 20;
        int b = -30;
        System.out.println(Math.abs(b)); //30
        System.out.println(Math.PI); //3.141592653589793
        System.out.println(Math.E); //2.718281828459045

//        System.out.println(E);
        System.out.println(Math.round(Math.PI)); //3
        System.out.println(Math.round(3.5)); //4
        System.out.println(Math.round(3.5 - 0.01)); //3
        System.out.println(Math.ceil(3.1)); // 4.0
        System.out.println(Math.floor(3.1)); // 3.0
        System.out.println(Math.sqrt(16)); //4.0
        System.out.println((int)Math.sqrt(9)); //3 int type
        System.out.println(Math.random()); //rand num from 0 to 1.0 (not inclusive)
        System.out.println((int) (Math.random() * 10)); // random from 0 to 9
//        for (int i = 0; i < 100; i++) {
//            System.out.println((int) (Math.random() * 10));
//        }
        System.out.println(Math.pow(2, 3)); //8.0
        System.out.println(Math.log(4)); // 1.3862943611198906
        System.out.println(Math.log10(100)); // 2.0
        System.out.println(Math.max(100, 50)); // 100

        System.out.println(Math.cos(1)); //0.5403023058681398


    }
}
