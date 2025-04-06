package org.example;

public class Calculator {
    public double calculateResult(double a, double b) {
        double x = a + b;
        double y = a * b;
        return x / y;
    }

    public void printResult(double res) {
        System.out.println("Result: " + res);
    }
}
