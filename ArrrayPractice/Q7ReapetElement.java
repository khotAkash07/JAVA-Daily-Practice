import java.util.Scanner;

class ReapetElement{
	int arr[];
	public void setArray(int arr[]){
		this.arr = arr;
	}
	
	public void getReapet(){
		for(int i = 0 ; i < arr.length-1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					System.out.println("Reapeted Element is = "+arr[i]);
				}
			}
		}
		
	}
}
public class Q7ReapetElement{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		ReapetElement re = new ReapetElement();
		re.setArray(arr);
		re.getReapet();
	}
}
