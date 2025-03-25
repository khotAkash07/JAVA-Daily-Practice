//Write a program to print only even numbers from an array

import java.util.Scanner;
public class ArrayEven{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Eneter any elements :");
		for(int i = 0; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Array elements are :");
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.print("\nEven elements are :");
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] % 2 == 0)
				System.out.print(arr[i]+" ");
		}
		System.out.print("\nOdd elements are :");
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] % 2 != 0)
				System.out.print(arr[i]+" ");
		}
	}
}