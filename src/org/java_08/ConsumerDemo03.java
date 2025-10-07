package org.java_08;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerDemo03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number");
        int a = sc.nextInt();

        ((Consumer<Integer>)(Integer integer) -> System.out.println(integer * integer)).accept(a);
    }
}
