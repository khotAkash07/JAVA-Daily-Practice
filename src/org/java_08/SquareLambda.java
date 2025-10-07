package org.java_08;

interface sqrt{
    int square(int a);
}
public class SquareLambda {
    public static void main(String[] args) {

        int result = ((sqrt)(int a) ->a * a).square(10);
        System.out.println(result);
    }
}