package com.recursion;

import java.util.Scanner;

public class FibonacciApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number target value :");
        int target = sc.nextInt();
        System.out.println("Enter a number target value :"+fibo(target));
    }

    private static int fibo(int target) {

        if(target < 2) return target;


        return fibo(target-1)+ fibo(target-2);
    }

//    public static void fibo(int target,int a,int b) {
//        if (target == 0) return;
//
//
//        System.out.println(a);//0 1
//        fibo(target-1,b,a+b);
//    }

}
