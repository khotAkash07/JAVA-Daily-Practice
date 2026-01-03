package com.java.java_08;

import java.util.function.BiConsumer;

public class ConsumerDemo {
    public static void main(String[] args) {

    //Addition of Two Number
//    BiConsumer<Integer,Integer> bc = new BiConsumer<Integer, Integer>() {
//        @Override
//        public void accept(Integer integer, Integer integer2) {
//            System.out.println(integer+integer2);
//        }
//    };
//    bc.accept(10,20);
    ((BiConsumer<Integer,Integer>)((a,b)->{System.out.println(a+b);})).accept(10,20);

    }
}
