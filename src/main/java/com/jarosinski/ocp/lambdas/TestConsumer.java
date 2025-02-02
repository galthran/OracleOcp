package com.jarosinski.ocp.lambdas;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.List;

public class TestConsumer {

    private static final Logger log = LoggerFactory.getLogger(TestConsumer.class);

    public static void main(String[] args) {
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        Consumer<String> printC = System.out::println;

        List<String> names = List.of("John", "Jane", "Adam");
        names.forEach(printC);

        var mapCapitalCities = new HashMap<String, String>();
        BiConsumer<String, String> biConsumer = mapCapitalCities::put;
        biConsumer.accept("Poland", "Warsaw");
        biConsumer.accept("Germany", "Berlin");
        biConsumer.accept("Austria", "Vienna");
        consumer.accept(mapCapitalCities.toString());

        BiConsumer<String, String> mapPrint = (k, v) -> System.out.println(k + " -> " + v);
        mapCapitalCities.forEach(mapPrint);
    }
}
