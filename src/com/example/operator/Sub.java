package com.example.operator;

public class Sub implements Operator {
    public static String tag = "-";

    @Override
    public Integer execute(Integer num0, Integer num1) {
        return Integer.valueOf(num1.intValue() - num0.intValue());
    }
}
