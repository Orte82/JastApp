package com.orte.pattern.decorator;

import java.io.PrintWriter;

public class DecoratorExample2 {
    public static void main(String[] args) {
        PrinterInterface pi = new QuatesPrinter(new Printer("Hello world with quates"));
        pi.print();
        System.out.println();
        PrinterInterface twobrackets = new LeftBracketDecorator(new RightBracketDecorator(new Printer("Something in brackets")));
        twobrackets.print();
    }

    public interface PrinterInterface {
        void print();
    }

    static class Printer implements PrinterInterface {
        String value;

        public Printer(String value) {
            this.value = value;
        }

        @Override
        public void print() {
            System.out.print(this.value);
        }
    }

    static class QuatesPrinter implements PrinterInterface {

        PrinterInterface component;

        public QuatesPrinter(PrinterInterface component) {
            this.component = component;
        }

        @Override
        public void print() {
            System.out.print("\"");
            component.print();
            System.out.print("\"");
        }
    }

    static class LeftBracketDecorator implements PrinterInterface {

        PrinterInterface component;

        public LeftBracketDecorator(PrinterInterface component) {
            this.component = component;
        }

        @Override
        public void print() {
            System.out.print("(");
            component.print();

        }
    }
    static class RightBracketDecorator implements PrinterInterface {

        PrinterInterface component;

        public RightBracketDecorator(PrinterInterface component) {
            this.component = component;
        }

        @Override
        public void print() {

            component.print();
            System.out.print(")");
        }
    }
}
