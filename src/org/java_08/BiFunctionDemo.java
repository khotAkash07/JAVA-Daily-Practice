package org.java_08;

import java.util.function.BiFunction;

@FunctionalInterface
interface TriFunction<A,B,C,R> {
    R apply(A a,B b,C c);
}
public class BiFunctionDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int k = 50;
        int c = ((TriFunction<Integer,Integer,Integer,Integer>)((aa,bb,kk) -> aa)).apply(a,b,k);
        System.out.println(c);
    }
}
