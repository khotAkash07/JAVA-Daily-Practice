package com.java.java_08;

import java.util.*;

public class FindDuplicate {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 1);
        Set<Integer> set = new HashSet<>();

        list.stream()
                .filter(x -> !set.add(x))
                .forEach(System.out::println);
    }
}


