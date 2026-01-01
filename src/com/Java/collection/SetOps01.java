package com.Java.collection;

import java.util.HashSet;
import java.util.Set;

public class SetOps01 {
    public static void main(String[] args) {

        String str = "Helloworld";

        Set<Character> set = new HashSet<>();
        Set<Character> duplicate = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {

            if(!set.add(str.charAt(i))) {
                duplicate.add(str.charAt(i));
            }
        }
        System.out.println(duplicate);
        System.out.println(set);

    }
}
