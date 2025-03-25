import java.util.Scanner;
public class Array_delete{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println("\nEnter number for deleting :");
		int myNum = sc.nextInt();
		int myNum2 = sc.nextInt();
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == myNum || arr[i] == myNum2){
				for(int j = i ; j < arr.length-1-count ; j++){
					arr[j] = arr[j+1];
				}
				count++;
				i--;
			}
		}
		
		System.out.println("After deleting Array elements are :");
		for(int i = 0 ; i < arr.length-count ;i++){
			System.out.print(arr[i]+" ");
		}
	}
}