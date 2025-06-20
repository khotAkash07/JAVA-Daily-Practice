import java.util.Scanner;

class CheckSort{
	int arr[];
	int copy[];
	public void setArray(int arr[]){
		this.arr = arr;
		this.copy = arr.clone();
	}
	
	public void checkSorted(){
		for(int i = 0 ; i < arr.length-1 ;i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		boolean flag = false;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != copy[i]){
				flag = true;
				break;
			}
		}
		for(int i = 0 ; i < arr.length-1 ;i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		boolean flag2 = false;
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != copy[i]){
				flag2 = true;
				break;
			}
		}
		System.out.print("\n");
		if(!flag){
			System.out.println("Given array is sorted (Assending)");
		}else if(!flag2){
			System.out.println("Given array is sorted (Descending)");
		}else{
			System.out.println("Given array is not sorted");
		}
	}
}
public class Q12CheckSortedArrayApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		CheckSort cs = new CheckSort();
		cs.setArray(arr);
		cs.checkSorted();
	}
}
	