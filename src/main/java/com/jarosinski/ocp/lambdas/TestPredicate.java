package com.jarosinski.ocp.lambdas;

import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class TestPredicate {

    public static void main(String[] args) {
        Evaluate<Integer> evaluate = t -> t < 0;
        System.out.println(evaluate.isNegative(-1));
        System.out.println(evaluate.isNegative(1));

        System.out.println("-----");
        Predicate<Integer> predicate = t -> t < 0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(1));

        System.out.println("-----");

        int x = 4;
        System.out.println("Is  " + x + " even? " + check(t -> t % 2 == 0, x));

        int y = 7;
        System.out.println("Is  " + y + " even? " + check(t -> t % 2 == 0, y));


        Predicate<Integer> predicate1 = t -> t < 0;
        Predicate<String> predicate2 = t -> t.startsWith("aaa");
        Predicate<String> predicate3 = t -> t.contains("zzzz");

        System.out.println("-----");
        System.out.println(predicate2.and(predicate3).test("aaa bbb cccc dddd eeee zzzz 123"));

        System.out.println("-----");
        List<Integer> testArray = List.of(1, 2, 3, 4, 5);

        Predicate<Integer> predicate4 = t -> t % 2 == 0;
        Predicate<Integer> predicate5 = t -> t == 5;

        List<Integer> filtered = testArray.stream().filter(predicate4.or(predicate5)).toList();
        System.out.println(filtered);

        System.out.println("-----");
        BiPredicate<String, Integer> predicate6 = ( s, i ) -> s.length() == i;
        System.out.println(predicate6.test("abc", 3));

        System.out.println("-----");
        BiPredicate<String, String> predicate7 = ( s1, s2 ) -> s1.startsWith(s2);
        System.out.println(predicate7.test("abc", "ab"));
    }


    public static <T> boolean check(Predicate<T> predicate, T t) {
        return predicate.test(t);
    }
}
