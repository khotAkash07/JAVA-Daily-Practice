package org.arrays;
import java.util.Scanner;

public class RemoveEleFromSpecificPos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements in the array");
        int [] arr = new int[5];
        for(int i =0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter position number for delete element :");
        int position = sc.nextInt();

        for(int i =0; i < arr.length-1; i++){
            if(i >= position)
                arr[i] = arr[i+1];
        }

        System.out.println("After Remove element :");
        for(int i =0; i < arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
