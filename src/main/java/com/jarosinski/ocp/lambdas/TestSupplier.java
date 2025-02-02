package com.jarosinski.ocp.lambdas;

import java.time.LocalDate;
import java.util.function.Supplier;

public class TestSupplier {

    public static void main(String[] args) {
        Supplier<String> supplier = () -> "Hello";
        System.out.println(supplier.get());

        Supplier<StringBuilder> supplier1 = StringBuilder::new;
        System.out.println(supplier1.get().append("Test"));

        Supplier<Double> supplier2 = Math::random;
        System.out.println(supplier2.get());

        Supplier<LocalDate> supplier3 = LocalDate::now;
        System.out.println(supplier3.get());
    }
}
