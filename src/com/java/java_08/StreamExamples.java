package com.java.java_08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExamples {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Anna", "bob", "Charlie", "David", "Digvijay", "Akash");

        List<String> names = list.stream().filter(x -> x.length() > 5).toList();
        System.out.println(names);

        List<Integer> nums = Arrays.asList(6, 9, 7, 4, 5, 2, 1);
        System.out.println(nums.stream().map(x->x*x).sorted().toList());

        System.out.println(nums.stream().reduce((a,b)->a+b).get());

        String str = "Hello World";
        System.out.println(str.chars().filter(x -> x == 'l').count());


    }
}
