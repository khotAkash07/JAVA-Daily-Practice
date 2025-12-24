//Write a program to count the occurrence of given number in a array


import java.util.Scanner;

public class Occurance{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		System.out.println("Eneter values for array :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Given Array : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			int count = 1;
			for(int j = i +1 ; j < arr.length ; j++){
				
				if(arr[i] == arr[j]){
					count++;
				}
				
			}
			System.out.println(arr[i] + " Present in arrray "+count+" Tiemes");
		}
	}
}