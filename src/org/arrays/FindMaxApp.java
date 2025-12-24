import java.util.*;

class FindMax{
	
	int myArr[];
	
	public void setArray(int myArr[]){
		this.myArr = myArr;
	}
	public int getMax(){
		int max = 0;
		
		for(int i = 0 ; i < myArr.length ; i++){
			if(max < myArr[i]){
				max = myArr[i];
			}
		}
		return max;
	}
}
public class FindMaxApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		FindMax fm = new FindMax();
		fm.setArray(arr);
		System.out.println("The max element from given array = "+fm.getMax());
	}
}