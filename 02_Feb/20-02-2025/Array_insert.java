import java.util.Scanner;

public class Array_insert{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		System.out.println("Enter 4 element ");
		for(int i = 0 ; i < arr.length - 1 ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements ");
		for(int i = 0 ; i < arr.length - 1 ; i++){
			System.out.println(arr[i]);
		}
		int k = 2;
		System.out.println("Enter number which can added into array"+ (arr.length - 1));
		int num = sc.nextInt();
		for(int i = arr.length - 1 ; i >= k ; i--){
				arr[i] = arr[i-1];				
		}
		arr[k] = num;
		System.out.println("Array elements after Adding element :");
		for(int i = 0 ; i < arr.length  ; i++){
			System.out.println(arr[i]);
		}
	}
}