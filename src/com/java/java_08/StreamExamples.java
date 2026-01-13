package com.java.java_08;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class StreamExamples {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Anna", "bob", "Charlie", "David", "Digvijay", "Akash");
        List<String> names = list.stream().filter(x -> x.length() > 5).toList();
        System.out.println(names);
        List<Integer> nums = Arrays.asList(6, 9, 7, 4, 5, 2, 1);
        System.out.println(nums.stream().map(x->x*x).sorted().toList());

        System.out.println(nums.stream().reduce(Integer::sum).get());
        String str = "Hello World";
        System.out.println(str.chars().filter(x -> x == 'l').count());

        //Min And Max
        System.out.println("Max "+Stream.of(2,78,21,45,3,1).max(Comparator.comparingInt(a -> a)).get());
        System.out.println("Min "+Stream.of(2,78,21,45,3,1).min(Comparator.comparingInt(a -> a)).get());


        //Flat Map

        List<List<Integer>> nestList = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5),
                Arrays.asList(6,7,8),
                Arrays.asList(9,10,11)
        );

        System.out.println(nestList.getFirst().get(2));
        List<Integer> flatList = nestList.stream().flatMap(Collection::stream).sorted().toList();
        for (Integer integer : flatList) {
            System.out.println(integer);
        }


    }
}
