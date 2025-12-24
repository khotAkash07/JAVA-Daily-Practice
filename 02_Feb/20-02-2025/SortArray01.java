//Accending Sorting
import java.util.Scanner;

public class SortArray01{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter array Element ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		//----------Accending sorting logic ----------
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
		//----------deccending sorting logic ----------
		/**********************************************
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
				}
			}
		}
		**********************************************/
		System.out.println("-----------Sorted(Accending) Array Elements are : --------------");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}