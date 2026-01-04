package com.java.collection;

import java.util.*;

public class FindFrequency {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "A", "C", "B");

        Map<String, Integer> map = new HashMap<>();

        for(String s : list) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        System.out.println(map);
    }
}
