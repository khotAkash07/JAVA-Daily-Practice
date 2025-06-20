import java.util.Scanner;

class CheckSort{
	int arr[];
	int copy[];
	public void setArray(int arr[]){
		this.arr = arr;
		this.copy = arr;
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
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
	}
}
public class Q12CheckSortedArrayApp{
	