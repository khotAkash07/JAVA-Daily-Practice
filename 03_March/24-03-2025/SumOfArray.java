import java.util.Scanner;
class ArraySum{
	
	int myArr[];
	void setArray(int a[]){
		myArr = a;
	}
	
	int getSum(){
		int sum = 0;
		for(int i = 0 ; i < myArr.length ; i++){
			sum += myArr[i];
		}
		return sum;
	}		
}

public class SumOfArray{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 5 elements of sum");
		int arr[] = new int[5];
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		ArraySum as = new ArraySum();
		as.setArray(arr);
		int result = as.getSum();
		System.out.println("The sum of all elements = "+result);
	}
}
		