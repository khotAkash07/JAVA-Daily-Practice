package org.java_08;

import java.util.function.Consumer;

public class ConsumerInterfaceDemo {
    public static void main(String[] args) {
        ((Consumer<Integer>)(Integer i) -> System.out.println(i*i*i)).accept(5);
    }
}
