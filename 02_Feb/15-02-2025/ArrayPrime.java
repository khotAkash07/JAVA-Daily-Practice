//Write  a program to print all prime numbers present in array

import java.util.Scanner;
public class ArrayPrime{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter Array Elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Prime array Elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			boolean flag = false;
			for(int j = 2 ; j <= arr[i]/2 ; j++)
				if(arr[i] % j == 0){
					flag = true;
				}
				if(flag){}else{
					System.out.println(arr[i]);
				}
	}
	}
}	