//find even and odd elements from array
import java.util.Scanner;
public class ArrayEvOd{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Eneter any elements :");
		for(int i = 0; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array elements are :");
		for(int i = 0; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}