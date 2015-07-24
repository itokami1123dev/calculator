package com.example.operator;

import com.example.operator.Operator;

public class Multi implements Operator {
    public static String tag = "*";

    @Override
    public Integer execute(Integer num0, Integer num1) {
        return Integer.valueOf(num0.intValue() * num1.intValue());
    }
}
