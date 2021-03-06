package com.example;

import com.example.operator.*;

import java.util.*;

public class Calculator {
    private final Map<String, Operator> opetators;

    public Calculator(Map<String, Operator> opetators) {
        this.opetators = opetators;
    }

    public int execute(String input) {
        Deque<Integer> stack = new ArrayDeque<>();

        for (String s : input.split("\\s")) {
            Operator operator = opetators.get(s);

            if (operator != null) {
                Integer num1 = stack.pop();
                Integer num2 = stack.pop();
                stack.push(operator.execute(num1, num2));

            } else {
                stack.push(Integer.valueOf(s));

            }

        }

        return stack.pop();
    }

}
