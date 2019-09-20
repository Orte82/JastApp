package com.orte.boostbrain.reflection;

public class ReflectionExample {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        ReflectionChecker checker = new ReflectionChecker();
        Rabbit rabbit = new Rabbit();
        checker.showClass(rabbit); //com.orte.boostbrain.reflection.Rabbit
        checker.showClassFields(rabbit);
        checker.showClassMethods(rabbit);
        checker.showFieldsAnnotations(rabbit);
        checker.fillPrivateFields(rabbit);
        Object clone = checker.createNewObject(rabbit);//com.orte.boostbrain.reflection.Rabbit
         checker.showClass(clone);
        System.out.println(rabbit.getRabbitAge());
        System.out.println(rabbit.getRabbitName());

    }
}
