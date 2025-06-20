import java.util.Scanner;

public class Array01{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		boolean flag = false;
		int arr[] = new int[10];
		System.out.println("Enter array elements :");
		
		for(int i = 0 ; i < arr.length ; i++){
				arr[i] = sc.nextInt();
		}
		System.out.println("Enter number to find in array :");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == num){
				flag = true;
				break;
			}
		}
		if(flag)
			System.out.println("The element is present in array....");
		else
			System.out.println("The element is not present in array....");
			
	}
}