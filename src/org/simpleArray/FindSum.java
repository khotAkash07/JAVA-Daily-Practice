package org.simpleArray;

import java.util.Scanner;

public class FindSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number : ");
        int n = sc.nextInt();
        int sum = 0;
        for(int i = 1 ; i <= n ; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
