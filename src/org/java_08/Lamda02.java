package org.java_08;

interface Lamda{
    void show();
}

public class Lamda02 {
    public static void main(String[] args) {

    Lamda l1 = () -> {
        System.out.println("This is Lamda Function");
    };
    l1.show();
}
}
