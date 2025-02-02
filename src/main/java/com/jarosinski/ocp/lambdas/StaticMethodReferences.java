package com.jarosinski.ocp.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class StaticMethodReferences {

    public static void main(String[] args) {

        Consumer<List<Integer>> sortL = list -> Collections.sort(list);
        Consumer<List<Integer>> sortMR = Collections::sort;

        List<Integer> list = Arrays.asList(2,1,5,4,9);
        sortL.accept(list);
        System.out.println(list);

        list = Arrays.asList(8,12,4,3,7);
        sortMR.accept(list);
        System.out.println(list);
    }
}
