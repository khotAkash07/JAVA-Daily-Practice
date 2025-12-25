package org.java_08;

import java.util.ArrayList;
import java.util.List;


public class ComparatorEx {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(List.of(1100, 2, 30, 4, 50, 16, 8, 9, 7, 10));


        list1.sort((a , b) -> b.compareTo(a));
        for (Integer i : list1) {
            System.out.println(i);
        }

    }
}
