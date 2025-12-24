import java.util.*;
class FindMin{
	int myArr[];
	
	public void setArray(int myArr[]){
		this.myArr = myArr;
	}
	public int findMin(){
		int min =	Integer.MAX_VALUE;
		
		for(int i = 0 ; i < myArr.length ; i++){
			if(min > myArr[i]){
				min = myArr[i];
			}
		}
		return min;
	}
}
public class FindMinApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter array elements :");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		FindMin fm = new FindMin();
		fm.setArray(arr);
		System.out.println("Minimum number in given array is = "+fm.findMin());
	}
}
