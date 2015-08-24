package com.example;

import com.example.operator.*;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String... args) {

        Map<String, Operator> opetators = new HashMap<>();
        opetators.put(Add.tag, new Add());
        opetators.put(Sub.tag, new Sub());
        opetators.put(Multi.tag, new Multi());
        opetators.put(Div.tag, new Div());
        Calculator cal = new Calculator(opetators);

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
