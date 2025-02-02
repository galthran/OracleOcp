package com.jarosinski.ocp.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class TestFunction {

    public static void main(String[] args) {
        Function<String, Integer> function = String::length;
        System.out.println(function.apply("Hello"));

        System.out.println("-----");
        BiFunction<String, String, Integer> biFunction = ((s, s2) -> s.length() + s2.length());
        System.out.println(biFunction.apply("Hello", "World"));

        System.out.println("-----");
        BiFunction<String, String, String> biFunction2 = String::concat;
        System.out.println(biFunction2.apply("Hello", " World"));
    }
}
