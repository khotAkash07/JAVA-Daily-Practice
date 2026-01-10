package com.java.core.janPractice;

import java.util.Scanner;

public class FindCount {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int [] arr = new int[10];
        int target = 5;
        System.out.println("Enter 10 numbers : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=input.nextInt();
        }
        int c = 0;
        for(int i: arr){
            if(i == target) c++;
        }

        System.out.println("The count of target is = "+c);
    }
}
