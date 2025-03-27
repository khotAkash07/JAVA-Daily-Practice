import java.util.Scanner;
class Rotate{
	int myArr[];
	
	public void setArray(int myArr[]){
		this.myArr = myArr;
	}
	public int[] getRotateArray(int rpos){
		for(int i = 0 ; i < rpos ; i++){
			int temp = myArr[0];
			for(int j = 0 ; j < myArr.length-1 ; j++){
				myArr[j] = myArr[j+1];
			}
			myArr[myArr.length-1] = temp;
		}
		return myArr;
	}
}
public class RotateKthPositionApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[10];
		
		System.out.println("Enter Array Elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter position to rotate array");
		int pos = sc.nextInt();
		
		Rotate r = new Rotate();
		r.setArray(arr);
		int res[] = r.getRotateArray(pos);
		for(int i = 0 ; i < res.length ; i++){
			System.out.print(res[i]+" ");
		}
	}
}