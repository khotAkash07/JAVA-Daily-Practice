import java.util.Scanner;
class FindOccourance{
	int arr[];
	int count;
	public void setArray(int arr[]){
		this.arr = arr;
	}
	public void getOccurrence(){
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("-----------------------------------------------------------------------");
		for(int i = 0 ; i < arr.length ; i++){
			System.out.println(arr[i]);
		}
														// 1 1 1 2 2 2 3 3 3 4
		for(int i = 0 ; i < arr.length-1 ; i+=count){
			count = 1;	
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					count++;
				}else if((j==(arr.length-1))&&((arr.length-1) != (arr.length-2))){
					System.out.println("Occurance of "+arr[arr.length-1]+" is "+1+" times.");
					
				}else{
					break;
				}
			}
			System.out.println("Occurance of "+arr[i]+" is "+count+" times.");
		}
	}
}
public class Q11FindOccouranceApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		FindOccourance fo = new FindOccourance();
		fo.setArray(arr);
		fo.getOccurrence();
	}
}