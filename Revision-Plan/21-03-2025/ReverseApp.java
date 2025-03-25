import java.util.Scanner;
public class ReverseApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements ");
		int arr[] = new int[6];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		int a = 0;
		int b = arr.length -1;
		while(a < b){
			int temp = arr[a];
			arr[a] = arr[b];
			arr[b] = temp;
			a++;
			b--;
		}
		System.out.println("Reverse Array elements are");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}