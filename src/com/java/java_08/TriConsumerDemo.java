package com.java.java_08;

@FunctionalInterface
interface TriConsumer<A,B,R>{
    R accept(A a,B b);
}
public class TriConsumerDemo {
    public static void main(String[] args) {
        System.out.println(((TriConsumer<Integer,Integer,Integer>)(Integer::sum)).accept(10,20));
    }
}
