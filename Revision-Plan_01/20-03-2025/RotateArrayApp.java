import java.util.Scanner;

public class RotateArrayApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements to Rotate");
		int arr[] = new int[7];
		
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter Position value");
		int pos = sc.nextInt();
		
		for(int i = 0 ; i < pos ; i++){
			int temp = arr[0];
			for(int j = 0 ; j < arr.length-1; j++){
				arr[j] = arr[j+1];
			}
			arr[arr.length-1] = temp;
			
		}
		
		System.out.println("Rotate array is ");
		
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}