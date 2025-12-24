import java.util.Scanner;

public class RevArray{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter array Element ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Array Elements are : ");
		int i,j;
		for(i = 0, j= arr.length - 1; i < j ; i++,j--){
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
		
		for(i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}