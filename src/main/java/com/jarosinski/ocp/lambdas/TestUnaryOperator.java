package com.jarosinski.ocp.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class TestUnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println(unaryOperator.apply("Hello"));

        BinaryOperator<String> binaryOperator = String::concat;
        System.out.println(binaryOperator.apply("Hello", " World"));
    }
}
