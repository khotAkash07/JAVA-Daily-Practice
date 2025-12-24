package org.java_08;

import java.util.function.BiConsumer;

@FunctionalInterface
interface BiConsumer2<A, B, C>{
    C apply(A a, B b);
}
public class BiConsumerDemo {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> BiConsumer = (a,b)->{
            System.out.println(a+b);
        };
        BiConsumer.accept(1,2);

        BiConsumer2<Integer,Integer,Integer> BiConsu = new BiConsumer2<Integer, Integer,Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
       int res =  BiConsu.apply(5,2);
       System.out.println(res);
    }
}
