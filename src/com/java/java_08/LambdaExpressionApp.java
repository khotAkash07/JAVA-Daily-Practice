package com.java.java_08;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@FunctionalInterface
interface MathOperations {
    int operation(int a, int b);
}
public class LambdaExpressionApp {
    public static void main(String[] args) {

        // MathOperations sumOps = (a, b) -> a+b;
        System.out.println(((MathOperations)((a, b) -> a+b)).operation(15, 20));

        Predicate<Integer> isEven = (a) -> a % 2 == 0;
        boolean b = isEven.test(13);
        System.out.println(b?"Even":"Odd");


        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbers.stream()
                .filter(isEven)
                .forEach(System.out::println);

        numbers.stream()
                .map(n -> n*n)
                .forEach(System.out::println);

        List<Integer> myList = numbers.stream().map(x -> x*x).toList();
        System.out.println(myList);

        List<Integer> myList2 = numbers.stream().map(x -> x*x).collect(Collectors.toList());
        System.out.println(myList);

        boolean b1 = numbers.stream().anyMatch(x -> x%2==0);
        System.out.println(b1);

        boolean b2 = numbers.stream().allMatch(x -> x%2==0);
        System.out.println(b2);

        boolean b3 = numbers.stream().noneMatch(x -> x%2==0);
        System.out.println(b3);

        Optional<Integer> myNum = numbers.stream().skip(3).findFirst();
        System.out.println(myNum.get());

        int anyNum = numbers.stream().skip(2).findAny().get();
        System.out.println(anyNum);
    }
}
