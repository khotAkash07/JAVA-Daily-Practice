//3. Write a java program to pass the array function name as findEvenOdd(), then display the even and odd number in array.
import java.util.Scanner;

class FindEvenOdd{
	int arr[];
	public void setArray(int arr[]){
		this.arr = arr;
	}
	public void findEvenOdd(){
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] % 2 == 0){
				System.out.println("Even = "+arr[i]);
			}else{
				System.out.println("Odd = "+arr[i]);
			}
		}
	}
}
public class FindEvenOddApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int num[] = new int[6];
		System.out.println("Enter array elements");
		for(int i = 0 ; i < num.length ; i++){
			num[i] = sc.nextInt();
		}
		
		FindEvenOdd feo = new FindEvenOdd();
		feo.setArray(num);
		feo.findEvenOdd();
	}
}