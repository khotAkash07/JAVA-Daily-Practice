import java.util.Scanner;

public class TwoD_Array01{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[3][3];
		System.out.println("Enter Array Element :");
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = 0 ; j < arr[i].length ; j++){
				arr[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter Array Element :");
		for(int i = 0 ; i < arr.length ; i++){
			int sum = 0;
			for(int j = 0 ; j < arr[i].length ; j++){
				System.out.print(arr[i][j]+" ");
				sum += arr[i][j];
			}
			System.out.println(" = "+sum);
		}
	}
}
		