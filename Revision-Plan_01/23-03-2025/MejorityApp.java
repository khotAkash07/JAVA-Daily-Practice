//4. Write a java program to pass the array function name as findMajority( ), if it's yes then return 1 otherwise return 0.

import java.util.Scanner;
class Mejority{
	int arr[];
	int count = 0;
	public void setArray(int arr[]){
		this.arr=arr;
	}
	public int getMejority(){
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr.length-1 ; i++){
			if(arr[i] == arr[i+1]){
				count++;
			}
		}
		if(count > arr.length/2){
			return 1;
		}
		return 0;
	}
}
public class MejorityApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		Mejority mj = new Mejority();
		mj.setArray(arr);
		System.out.println((mj.getMejority()==1)?"Mejority present":"Mejority not present");
	}
}