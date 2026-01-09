package com.java.core;

import java.util.Scanner;

public class Demo {

    static int reverse(int num, int rev){
        if(num == 0) return rev;
        return reverse(num/10, rev * 10 + num % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num, 0));
    }
}
