package org.java_08;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class StreamApi {
    public static void main(String[] args) {

        //List.of(1,2,3,4,5,6,7,8,9).stream().filter(n -> n%2==0).map(myNum -> myNum+1).forEach(System.out::println);
        List<Integer> list = Arrays.asList(2,4,5,6,8);

       int a =  list.stream().map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println(a);

        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list1 = list2.stream().filter(e -> e%2 == 0).map(e -> e*e).toList();
        System.out.println(list1);

        Consumer<Integer> consumer = new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println(integer);
            }
        };
        consumer.accept(1);
    }
}
