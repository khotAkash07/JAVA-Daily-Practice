package com.java.java_08;

@FunctionalInterface
interface MathOperations {
    int operation(int a, int b);
}
public class LambdaExpressionApp {
    public static void main(String[] args) {

       // MathOperations sumOps = (a, b) -> a+b;
        System.out.println(((MathOperations)((a, b) -> a+b)).operation(15, 20));
    }
}
