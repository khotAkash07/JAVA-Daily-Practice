import java.util.Scanner;

public class Array01{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter 5 elements :");
		for(int i = 0 ; i < 5 ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Given Array elements are :");
		for(int i = 0 ; i<5 ; i++){
			System.out.println(arr[i]);
		}
		
		int i,j;
		
		for( i = 0, j = arr.length - 1 ; i <= j ; i++,j--){
			
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			
		}
		System.out.println("reverse array elements :");
		for( i = 0 ; i<arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}