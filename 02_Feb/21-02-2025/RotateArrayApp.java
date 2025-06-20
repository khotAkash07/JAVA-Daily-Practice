import java.util.Scanner;

public class RotateArrayApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = {0,3,6,9,12,14,18,20,22,25,27};
		
		System.out.println("Enter index for rotate array :");
		
		int index = sc.nextInt();
		int arr2[] = new int[index];
		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("Given Array is ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+"\t");
		}
		
		for(int i = 0 ; i < index ; i++){
			arr2[i] = arr[i];
		}
		for(int a = 0 ; a < arr2.length ; a++){
			for(int i = 0 ; i < arr.length - 1 ; i++){
				arr[i] = arr[i+1];
			}
		}
		System.out.println("\n--------------------------------------------------------------------------------");
		System.out.println("Rotated Array is ");
		int x = arr.length - index;
		int y = 0;
		while(x < arr.length){
			arr[x] = arr2[y];
		
			x++;
			y++;
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+"\t");
		}
	}
}