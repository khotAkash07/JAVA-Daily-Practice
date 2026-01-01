package com.recursion;

import java.util.Scanner;

public class FactorialApp {
    public static void main(String[] args) {

        System.out.println("Enter number to find factorial : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Factorial of "+n+" is : "+fact(n));
    }

    private static int fact(int n) {
        if (n == 1) return 1;
        return n * fact(n-1);
    }
}
