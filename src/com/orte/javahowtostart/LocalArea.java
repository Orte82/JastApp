package com.orte.javahowtostart;

public class LocalArea {
    int num = 10; // object variable

    public static void main(String[] args) {
        int num = 10; // local variable

        {
            //block scope
            int num2 = 55;
            System.out.println(num2);
        }
        {
            int num2 = 100;
            System.out.println(num2);

        }
        {
            {
                int aa = 22;
                {
                    aa = 66;
                    System.out.println(aa);
                }
            }
        }
//        System.out.println(num2); //syntax error
        System.out.println(num);
    }
}
