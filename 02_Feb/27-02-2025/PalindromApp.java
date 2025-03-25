import java.util.Scanner;

class Palindrom{
	
	int arr[];
	
	void setArr(int arr2[]){
		arr = arr2;
	}
	
	void checkPalindrom(){
		for(int i=0,j=arr.length-1 ; i < arr.length ; i++,j--){
			if(arr[i] < arr[j]){
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		System.out.println("Reverse Array is :");
		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
				
	}
}
public class PalindromApp{
	public static void main(String args[]){
		
		Scanner sc = new scanner(Syetm.in);
		
		int arr[] = new int[5];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		Palindrom pl = new Palindrom();
		
		pl.setArr(arr);
		pl.checkPalindrom();
	}
}