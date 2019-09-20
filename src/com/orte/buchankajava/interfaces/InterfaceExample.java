package com.orte.buchankajava.interfaces;

public class InterfaceExample {

    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234556);
        timsPhone.powerOn();
        timsPhone.callPhone(1234556);
        timsPhone.answer();

        timsPhone = new MobilePhone(23456  );
        timsPhone.powerOn();
        timsPhone.callPhone(23456);
        timsPhone.answer();


    }
}
