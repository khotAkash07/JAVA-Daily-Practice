import java.util.*;
class Reverse{
	int myArr[];
	
	public void setArray(int myArr[]){
		this.myArr = myArr;
	}
	public int[] getReverse(){
		int i = 0;
		int j = myArr.length-1;
		while(i < j){
			int temp = myArr[i];
			myArr[i] = myArr[j];
			myArr[j] = temp;
			
			i++;
			j--;
		}
		return myArr;
	}
}
public class ReverseApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		Reverse r = new Reverse();
		r.setArray(arr);
		int result[] = r.getReverse();
		for(int i = 0 ; i < result.length ; i++){
			System.out.print(result[i]+" ");
		}
	}
}
