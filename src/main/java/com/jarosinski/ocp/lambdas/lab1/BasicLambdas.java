package com.jarosinski.ocp.lambdas.lab1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BasicLambdas {

    public static void main(String[] args) {
        consumer();
        supplier();
        predicate();
        function();

        List<Person> listPeople = getPeople();

        sortAge(listPeople);
        sortName(listPeople);
        sortHeight(listPeople);
    }

    private static void sortAge(List<Person> listPeople) {
        var peopleSortedByAge = listPeople.stream().sorted(Comparator.comparing(Person::getAge)).toList();
        peopleSortedByAge.forEach(System.out::println);
    }

    private static void  sortName(List<Person> listPeople) {
        var peopleSortedByName = listPeople.stream().sorted(Comparator.comparing(Person::getName)).toList();
        peopleSortedByName.forEach(System.out::println);
    }

    private static void  sortHeight(List<Person> listPeople) {
        var peopleSortedByHeight = listPeople.stream().sorted(Comparator.comparing(Person::getHeight)).toList();
        peopleSortedByHeight.forEach(System.out::println);
    }


    private static void consumer() {
        Printable<String> printable = System.out::println;
        printable.print("Printable lambda");

        Consumer<String> customer1 = s -> System.out.println(s);
        customer1.accept("Printable lambda");

        Consumer<String> customer2 = System.out::println;
        customer2.accept("Printable lambda");
    }

    private static void supplier()  {
        Retrievable<Integer> retrievable = () -> 77;
        System.out.println(retrievable.retrieve());

        Supplier<Integer> supplier = () -> 77;
        System.out.println(supplier.get());
    }

    private static void predicate() {
        Evaluate<Integer> evaluate = t -> t < 0;
        System.out.println(evaluate.isNegative(-1));
        System.out.println(evaluate.isNegative(1));

        Predicate<Integer> predicate = t -> t < 0;
        System.out.println(predicate.test(-1));
        System.out.println(predicate.test(1));

        int x = 4;
        System.out.println("Is  " + x + " even? " + check(x, t -> t % 2 == 0));

        int y = 7;
        System.out.println("Is  " + y + " even? " + check(y, t -> t % 2 == 0));

        String a = "Mr. Joe Bloggs";
        System.out.println("Is  " + a + " a title? " + check(a, t -> t.startsWith("Mr.")));

        String b = "Ms. Ann Bloggs";
        System.out.println("Is  " + b + " a title? " + check(b, t -> t.startsWith("Mr.")));

        Person mike = new Person("Mike", 33, 1.8);
        System.out.println("Is Mike adult? " + check(mike, t -> t.getAge() >= 18));

        Person ann = new Person("Ann", 13, 1.4);
        System.out.println("Is Ann adult? " + check(ann, t -> t.getAge() >= 18));
    }

    private static void function() {
        Functionable<Integer, String >  functionable = t -> "Number is: " + t;
        System.out.println(functionable.apply(25));

        Function<Integer, String >  function = t -> "Number is: " + t;
        System.out.println(function.apply(25));
    }

    private static <T> boolean check(T t, Predicate<T> predicate) {
        return predicate.test(t);
    }

    private static List<Person> getPeople() {
        List<Person> result = new ArrayList<>();
        result.add(new Person("Mike", 33, 1.8));
        result.add(new Person("Mary", 25, 1.4));
        result.add(new Person("Alan", 34, 1.7));
        result.add(new Person("Zoe", 30, 1.5));
        return result;
    }
}
