package com.java.java_08;

import java.util.List;
import java.util.stream.Stream;

public class ParallelStream {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> list = Stream.iterate(0, x -> x+1).limit(100000).toList();
        List<Integer> factList = list.stream().map(ParallelStream::fact).toList();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime +" ms - |");

        startTime = System.currentTimeMillis();
        list = Stream.iterate(0, x -> x+1).limit(100000).toList();
        factList = list.parallelStream().map(ParallelStream::fact).toList();
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime +" ms - ||");
    }

    private static int fact(int n){
        int i = 1;
        while(n > 0){
            i *= n;
            n--;
        }
        return i;
    }
}
