package com.jarosinski.ocp.lambdas;

@FunctionalInterface
public interface Evaluate<T> {
    boolean isNegative(T t);
}
