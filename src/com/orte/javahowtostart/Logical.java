package com.orte.javahowtostart;

public class Logical {
    // And  => &&
    // true && true = true      true && false = false
    // false && false = false   false && true = false

    //OR => ||
    // true || true = true      true || false = true
    // false || false = false   false || true = true

    //XOR => ^  true if one operator is true and other is false
    // true ^ true = false      true ^ false = true
    // false ^ false = false   false ^ true = true

    //NOT => !
    // !false = true    !true = false

    public static void main(String[] args) {
        int number = 45;
        if (number > 0 && number <100) {
            System.out.println("Hello");
        }else{
            System.out.println("Out of bound");
        }
    }
}
