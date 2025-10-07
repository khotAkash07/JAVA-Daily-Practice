package org.java_08;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

      //  List.of(10,20,30,40,50,60).stream().map(val -> val*2).forEach(num -> System.out.println(num));


        List.of(1,2,3,4,5,6,7,8,9).stream().filter(val -> val%2==0).map(m -> m+1).forEach(System.out::println);
    }
}
