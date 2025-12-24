import java.util.Scanner;

public class SearchApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements ");
		int arr[] = new int[5];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter value for searching");
		int num = sc.nextInt();
		
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == num){
				System.out.println(num+" find at "+i+" index");
			}
		}
	}
}