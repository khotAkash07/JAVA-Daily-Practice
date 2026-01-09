package org.Practice;

public class NumberClassApp {
    public static void main(String[] args) {

        int a  = 10;
        float b = 10.50f;
        System.out.println(a + " "+ b );

        Integer c = a; // AutoBoxing
        Float d = Float.valueOf(b); //Boxing
        System.out.println(c + " "+ d);

        int k = c; // AutoUnBoxing
        int j = c.intValue(); // UnBoxing
        System.out.println(k + " "+ k);
    }
}