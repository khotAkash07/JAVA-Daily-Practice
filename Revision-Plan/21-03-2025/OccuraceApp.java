import java.util.Scanner;

public class OccuraceApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements ");
		int arr[] = new int[10];
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
		
		//finding occurance
		
		for(int i = 0 ; i < arr.length; i++){
			int count = 0;
			for(int j = 0 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			System.out.println("Occurance of "+arr[i]+" in given array is = "+count);
			i += count-1;
		}
		
	}
}