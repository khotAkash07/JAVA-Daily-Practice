import java.util.Scanner;

public class Array02{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter values for array :");
		int arr[] = new int[6];
		
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Given Array : ");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Assending Array : ");
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i ; j < arr.length ; j++){
				
				if(arr[i] > arr[j]){
					int temp  = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}


		
		