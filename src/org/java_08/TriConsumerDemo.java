package org.java_08;
import java.util.function.BiConsumer;

@FunctionalInterface
interface TriConsumer<A,B,C>{
    C accept(A a,B b);
}
public class TriConsumerDemo {
    public static void main(String[] args) {
       // int result = ((TriConsumer<Integer,Integer,Integer>)((a,b)->a+b)).accept(50,20);
       // System.out.println(result);
        ((BiConsumer<Integer, Integer>)((a, b)-> System.out.println(a+b))).accept(30,50);
        System.out.println(findFact(4));
    }

    public static int findFact(int num){

        if(num == 0) return 1;

        return num * findFact(num-1);
    }
}
