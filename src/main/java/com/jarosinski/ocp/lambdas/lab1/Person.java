package com.jarosinski.ocp.lambdas.lab1;

public class Person {

    private final String name;

    private final Integer age;

    private final Double height;

    public Person(String name, Integer age, Double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", height=" + height + "]";
    }
}
