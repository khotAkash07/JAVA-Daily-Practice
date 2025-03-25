import java.util.Scanner;
public class Array_largest{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array elements are :");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.print("\nThe 3rd largest number is : ");
		int count = 1;
		int k = 3;
		for(int i = 0 ; i < arr.length-1 ; i++){
			if(arr[i] != arr[i+1])
				count++;
			
			if(count == k){
				System.out.print(arr[i+1]);
				break;
			}
			
		}
	}
}