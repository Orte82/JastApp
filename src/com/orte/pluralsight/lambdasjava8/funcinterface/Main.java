package com.orte.pluralsight.lambdasjava8.funcinterface;

public class Main {
    public static void main(String[] args) {
//        Predicate<String> p = s -> s.length() < 20;
//        boolean b = p.test("Hello");
//        System.out.println(b);
        Predicate<String> p1 = s -> s.length() < 20;
        Predicate<String> p2 = s -> s.length() > 5;

        Predicate<String> p3 = p1.and(p2);

        System.out.println("P3 for Yes: " + p3.test("Yes"));
        System.out.println("P3 for Good Morning: " + p3.test("Good Morning"));
        System.out.println("P3 for Good morning gentlemen: " + p3.test("Good morning gentlemen"));

        Predicate<String> p4 = p1.or(p2);
        System.out.println("P4 for Yes: " + p4.test("Yes"));
        System.out.println("P4 for Good Morning: " + p4.test("Good Morning"));
        System.out.println("P4 for Good morning gentlemen: " + p4.test("Good morning gentlemen"));

        Predicate<String> p5 = Predicate.isEqualsTo("Yes");
        System.out.println("is Yes " + p5.test("Yes"));
        System.out.println("is No " + p5.test("No"));
    }

}
