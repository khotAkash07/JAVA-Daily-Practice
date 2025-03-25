import java.util.Scanner;
public class AscendingDescendingApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements ");
		int arr[] = new int[5];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("-------------------------------------");
		System.out.println("Ascending Array elements are :");
		for(int i = 0 ; i < arr.length -1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		
		System.out.println("-------------------------------------");
		System.out.println("Descending Array elements are :");
		for(int i = 0 ; i < arr.length -1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
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