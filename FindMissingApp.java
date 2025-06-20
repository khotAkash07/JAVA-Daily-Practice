//Find the missing number From array

import java.util.Scanner;
class MissingNumbers{
	int arr[];
	public void setArray(int arr[]){
		this.arr = arr;
	}
	public void findMissing(int range){
		
		for(int i = 0 ; i <= range ; i++){
			int c = 0;
			for(int j = 0 ; j < arr.length ; j++){
				if(i == arr[j]){
					c++;
				}
			}
			if(c == 0){
				System.out.println(i);
			}
		}
	}
}
public class FindMissingApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter range : ");
		int range = sc.nextInt();
		
		MissingNumbers mn = new MissingNumbers();
		mn.setArray(arr);
		mn.findMissing(range);
	}
}
		