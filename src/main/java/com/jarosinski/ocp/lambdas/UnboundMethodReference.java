package com.jarosinski.ocp.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class UnboundMethodReference {

    public static void main(String[] args) {

        Function<String, String> upperL = s -> s.toUpperCase();
        Function<String, String> upperMR = String::toUpperCase;

        System.out.println(upperL.apply("sean"));
        System.out.println(upperMR.apply("sean"));

        BiFunction<String, String, String> concatL = (s, s2) -> s.concat(s2);
        BiFunction<String, String, String> concatMR = String::concat;

        System.out.println(concatL.apply("sean", " bloggs"));
        System.out.println(concatMR.apply("sean", " bloggs"));
    }
}
