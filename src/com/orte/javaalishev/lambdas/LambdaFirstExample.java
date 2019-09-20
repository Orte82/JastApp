package com.orte.javaalishev.lambdas;

public class LambdaFirstExample {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> System.out.println("Hello")); //lambda
        Runner runner = new Runner();
        runner.run(new ExecutableImpl());
        runner.run(new Executable() {
            @Override
            public void execute() {
                System.out.println("Executing anonymous class");
            }
        });
        runner.run(()-> System.out.println("Executing lambda"));
    }
    public void test(){
        System.out.println("Testing...");
    }
}

class ExecutableImpl implements Executable{

    @Override
    public void execute() {
        System.out.println("Executing class");
    }
}

interface Executable{
    void execute();
}

class Runner{
    public void run(Executable e){
        e.execute();
    }
}