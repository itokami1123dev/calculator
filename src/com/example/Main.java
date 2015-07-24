package com.example;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        String[] tests = {
                "1 2 +",
                "1 2 -",
                "6 1 2 + /",
                "1 2 3 * +",
                "1 2 3 * + 10 *",
                "1 2 3 * + 10 * 7 /",
                "1 2 3 * + 10 10 * +",
                "1 2 3 * - 10 10 * -",
        };

        for (String test : tests) {
            System.out.format("%s = %d \n", test, cal.execute(test));
        }
    }
}
