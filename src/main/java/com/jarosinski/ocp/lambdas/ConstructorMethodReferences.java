package com.jarosinski.ocp.lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ConstructorMethodReferences {

    public static void main(String[] args) {

        Supplier<StringBuilder> sbL = () -> new StringBuilder();
        Supplier<StringBuilder> sbMR = StringBuilder::new;

        StringBuilder sb1 = sbL.get();
        sb1.append("AAAA");
        System.out.println(sb1);

        StringBuilder sb2 = sbMR.get();
        sb2.append("BBBB");
        System.out.println(sb2);

        Function<Integer, List<String>> alL = x -> new ArrayList<>(x);
        Function<Integer, List<String>> alMR = ArrayList::new;

        List<String> al1 = alL.apply(5);
        al1.add("AAAA");
        System.out.println(al1);

        List<String> al2 = alMR.apply(5);
        al2.add("BBBB");
        System.out.println(al2);
    }
}
