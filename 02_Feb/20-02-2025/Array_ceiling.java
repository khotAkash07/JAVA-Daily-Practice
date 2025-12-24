//Ceiling 
import java.util.Scanner;
public class Array_ceiling{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[7];
		
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp =arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		System.out.println("Sorted array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		
		
		System.out.println("\nEnter number for finding siling :");
		int myNum = sc.nextInt();
		System.out.print("Seiling of given number is : ");
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == myNum){
				System.out.println(arr[i]);
				break;
			}
			//31 31 54 78 654 874 876
			else if(arr[i] > myNum){
				System.out.println(arr[i]);
				break;
			}
			
		}
	}
}