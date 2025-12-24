package org.java_08;

import java.util.Arrays;
import java.util.List;

public class StreamApi {
    public static void main(String[] args) {

        //List.of(1,2,3,4,5,6,7,8,9).stream().filter(n -> n%2==0).map(myNum -> myNum+1).forEach(System.out::println);
        List<Integer> list = Arrays.asList(2,4,5,6,8);

       int a =  list.stream().map(n -> n*n)
                .reduce(0, Integer::sum);

        System.out.println(a);
    }
}
