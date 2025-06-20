import java.util.Scanner;

class SecLargeEle{
	int arr[];
	public void setArr(int arr[]){
		this.arr = arr;
	}
	public int getSecLarge(){
		for(int i = 0 ; i < arr.length-1 ;i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < arr.length-1 ;i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] != arr[j]){
					return arr[j];
				}
			}
		}
		return 0;
	}
}
public class Q14SecLargeEle{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		SecLargeEle sle = new SecLargeEle();
		sle.setArr(arr);
		int result = sle.getSecLarge();
		System.out.println("second largest element is ="+result);
	}
}
		