package com.java_base.classObject2;

class Calculator {

    public int sum(int a, int b) {
        return a + b;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public double sum(String a, String b) {
        return Double.parseDouble(a) + Double.parseDouble(b);
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Practice {
    public static void main(String[] args) {
        // Test code
        Calculator c = new Calculator();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum(1.0, 2.0));
        System.out.println(c.sum("1", "2"));
        System.out.println(c.sum(1, 2, 3));
    }
}
