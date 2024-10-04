package org.develhope.java_advanced.oop_concepts.interfaces._assignments;

public class CalculatorClasssV2 implements Calculator{
    @Override
    public double sum(double a, double b) {
        return a + b;
    }

    @Override
    public double subtract(double a, double b) {
        return a - b;
    }

    @Override
    public double multiply(double a, double b) {
        return a * b;
    }

    @Override
    public double divide(double a, double b) {
        try {
            return a / b;

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
            return 0;
        }
    }
}
