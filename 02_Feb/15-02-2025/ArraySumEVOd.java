//Write a program to find the sum of even elements and odd elements
import java.util.Scanner;
public class ArraySumEVOd{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		int sumEv = 0;
		int sumOdd = 0;
		System.out.println("Eneter any elements :");
		for(int i = 0; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i = 0; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] % 2 == 0){
				sumEv += arr[i];
			}
			else{
				sumOdd += arr[i];
			}
		}
		System.out.println("Sum of even Array elements are : "+sumEv);
		System.out.println("Sum of odd Array elements are : "+sumOdd);
	}
}
		