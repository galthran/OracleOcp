package com.jarosinski.ocp.lambdas.lab1;

public interface Functionable<T, R> {
    R apply(T t);
}
