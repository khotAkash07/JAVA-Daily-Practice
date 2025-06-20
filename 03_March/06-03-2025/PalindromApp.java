import java.util.Scanner;

class Palindrom{
	
	int arr[];
	int copy[] = new int[5];
	
	void setArr(int arr2[]){
		arr = arr2;
	}
	
	void checkPalindrom(){		
		for(int i = 0 ; i < arr.length ; i++){
			copy[i] = arr[i];
		}		
		int i7 = 0;
		int j = arr.length - 1;		
		while(i7 < j){			
				int temp = arr[i7];
				arr[i7] = arr[j];
				arr[j] = temp;			
			i7++;
			j--;
		}
		System.out.println("-----------------------------------------------");
		System.out.println("Reverse Array is :");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("-----------------------------------------------");
		System.out.println("Copy Array is :");		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(copy[i]);
		}
		
		System.out.println("-----------------------------------------------");
		boolean flag = true;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != copy[i]){
				flag = false;
				break;
			}
		}
		if(flag)
			System.out.println("is palindrom");
		else
			System.out.println("is not palindrom");
	}
}
public class PalindromApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		Palindrom pl = new Palindrom();
		
		pl.setArr(arr);
		pl.checkPalindrom();
	}
}