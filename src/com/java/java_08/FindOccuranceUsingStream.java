package com.java.java_08;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class FindOccuranceUsingStream {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,4,2,3,4,3,2,2,2,1,3,1,2,3,1,2,3,1,2,3,2,1,3};

        Map<Integer, Long> map =
                Arrays.stream(arr)
                        .boxed()
                        .collect(Collectors.groupingBy(
                                i -> i,
                                Collectors.counting()
                        ));

        map.forEach((key, value) ->
                System.out.println("Number " + key + " Occurred for " + value + " Times.")
        );
    }
}
