package com.jsquoolt.sortalgorithms.recursion;

public class Main {

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
    }

    public static int factorial(int number) {
        if (number == 0)
            return 1;

        return number * factorial(number - 1);
    }
}
