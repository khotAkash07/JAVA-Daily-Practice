package org.arrays;

import java.util.Scanner;

public class RemoveTwoValuesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        int [] arr = new int[8];
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter fist number for delete :");
        int first = sc.nextInt();
        System.out.println("Enter Second number for delete :");
        int sec = sc.nextInt();

        for(int i =0; i < arr.length-2; i++){
            if(i == first){
                sec -= 1;
            }

            if(i >= first && i <= sec)
                arr[i] = arr[i+1];


            if(i >= sec)
                arr[i] = arr[i+2];

        }

        System.out.println("After Remove element :");
        for(int i =0; i < arr.length-2; i++){
            System.out.println(arr[i]);
        }
    }
}
