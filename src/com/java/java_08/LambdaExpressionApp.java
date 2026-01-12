package com.java.java_08;

import java.util.function.Predicate;

@FunctionalInterface
interface MathOperations {
    int operation(int a, int b);
}
public class LambdaExpressionApp {
    public static void main(String[] args) {

        // MathOperations sumOps = (a, b) -> a+b;
        System.out.println(((MathOperations)((a, b) -> a+b)).operation(15, 20));

        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        boolean b = isEven.test(13);
        System.out.println(b?"Even":"Odd");

    }
}
