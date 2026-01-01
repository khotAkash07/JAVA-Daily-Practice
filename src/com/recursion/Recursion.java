package com.recursion;

public class Recursion {
    static int sum;
    public static void main(String[] args) {
        findSum(5);
    }

    public static void findSum(int n){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum +=n;
        findSum(n-1);
    }
}
