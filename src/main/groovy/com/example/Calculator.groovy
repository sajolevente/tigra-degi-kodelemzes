package com.example

class Calculator {
    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }

    int multiply(int a, int b) {
        return a * b
    }

    int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero")
        }
        return a / b
    }

    int max(int a, int b) {
        return a > b ? a : b
    }
    
    int factorial(int n) {
        if (n == 0) {
            return 1
        }
        return n * factorial(n - 1) // Bug: no check for negative numbers
    }
}
