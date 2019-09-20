package com.orte.javahowtostart;

public class Label {
    public static void main(String[] args) {
        label:
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
                if(i==4 && j==3){
                    break label;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        label2:
        for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j < 5; j++) {

                if(i==3){
                    System.out.println("Continue");
                    continue label2;
                }
                System.out.print("* ");
            }
            System.out.println();
        }
        /*
        http://google.com
        System.out.println("Hello world");
         */
    }
}
