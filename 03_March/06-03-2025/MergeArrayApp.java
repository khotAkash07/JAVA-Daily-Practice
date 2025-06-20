import java.util.Scanner;
class MergeArray{
	
	int arr[];
	int arr2[];
	int arr3[];
	
	void getArray(int n1[],int n2[]){
		arr = n1;
		arr2 = n2;
	}
	
	void performMerge(){
		System.out.println("-----------------------------------------------------------------");
		System.out.println("First array elements");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
		System.out.println("Second array elements");
		for(int i = 0 ; i < arr2.length ; i++){
			System.out.println(arr2[i]);
		}
		System.out.println("-----------------------------------------------------------------");

		System.out.println("After Merge");
		
		int arr3[] = new int[arr.length + arr2.length];
		this.arr3 = arr3;
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++){
			arr3[count] = arr[i];
			count++;
		}
		for(int i = 0 ; i < arr2.length ; i++){
			arr3[count] = arr2[i];
			count++;
		}
		for(int i = 0 ; i < arr3.length ; i++){
			System.out.println(arr3[i]);
		}
	}
	void sortArray(){
		
		System.out.println("-----------------------------------------------------------------");
		System.out.println("After Sort Array is :");
		
		for(int i = 0 ; i < arr3.length ; i++){
			for(int j = i+1 ; j < arr3.length-1 ; j++){
				if(arr3[i] > arr3[j]){
					int temp = arr3[i];
					arr3[i] = arr3[j];
					arr3[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr3.length ; i++){
			System.out.println(arr3[i]);
		}

	}
	
}
public class MergeArrayApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		int arr2[] = new int[5];
		
		System.out.println("Enter First array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Second array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr2[i] = sc.nextInt();
		}
		
		
		MergeArray ma = new MergeArray();
		ma.getArray(arr,arr2);
		ma.performMerge();
		ma.sortArray();
	}
}