package com.jarosinski.ocp.lambdas;

public class BasicLambdas {

    public static void main(String[] args) {

        I i = new I() {
            @Override
            public void m() {
                System.out.println("Hello");
            }
        };
        i.m();

        I lambdaI = () -> {
            System.out.println("Hello");
        };
        lambdaI.m();

        I lambdaI2 = () -> System.out.println("Hello");
        lambdaI2.m();
    }
}
