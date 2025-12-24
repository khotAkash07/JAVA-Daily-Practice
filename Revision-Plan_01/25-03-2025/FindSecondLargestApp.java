import java.util.Scanner;

class SecondLarge{
	int arr[];
	public void setArr(int arr[]){
		this.arr = arr;
	}
	public int getLarge(){
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr.length-1 ; i++){
			if(arr[i] != arr[i+1])	return arr[i+1];
		}	
		return 0;
	}
}
public class FindSecondLargestApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter array elements");
		for(int i = 0 ; i  < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		SecondLarge sl = new SecondLarge();
		sl.setArr(arr);
		System.out.println("Second largest element is ="+sl.getLarge());
		
	}
}