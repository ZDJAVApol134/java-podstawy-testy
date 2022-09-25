package com.sda;

public class Calculator {

    public double sumArray(double[] arr) {

        double result = 0;

        for (double numb : arr) {
            result = result + numb;
        }

        return result;
    }

    public double sum(double a, double b) {
        return a + b;
    }

    public int division2(int a, int b) {
        if (b == 0) {
            return 0;
        }
        return a / b;
    }

    public int division(int a, int b) {
        if (b == 0) {
            throw new RuntimeException("Division by zero is not allowed.");
        }
        return a / b;
    }


}
