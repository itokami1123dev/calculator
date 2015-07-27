package com.example;

public class Main {

    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println("-----------------------");

        System.out.format("%s = %d \n", "1 2 +", cal.executeOld("1 2 +"));
        System.out.format("%s = %d \n", "1 2 3 * +", cal.executeOld("1 2 3 * +"));

        System.out.println("-----------------------");

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
