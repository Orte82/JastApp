package com.orte.boostbrain.reflection;

public class Rabbit {
    @Deprecated(forRemoval = true, since = "19.08.2019")
    @SuppressWarnings(value ="") // accessible only in compile time
    @RabbitAnnotation
    private String rabbitName;
    @Deprecated
    private String rabbitAge;
    private void jumpUp(){
        System.out.println("Rabbit jumping");
    }

    public String getRabbitName() {
        return rabbitName;
    }

    public String getRabbitAge() {
        return rabbitAge;
    }
}
