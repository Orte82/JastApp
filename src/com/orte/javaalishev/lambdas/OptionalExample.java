package com.orte.javaalishev.lambdas;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalExample {
    public static void main(String[] args) {
        Optional<String> optional = Optional.empty();
        Optional<String> optional2 = Optional.ofNullable(null);
        Stream.of(1).min((x,y)-> y -x).isPresent();

        Optional<String> optional3 = getO();
        if(optional.isPresent()){
        System.out.println(optional3.get());}
    }
    static Optional<String> getO(){
        if(true){
            return Optional.of("Hello");
        }
        return Optional.empty();
    }
}
