import java.util.Scanner;
class MoveZeros{
	
	int myArr[];
	int count = 0;
	public void setArray(int myArr[]){
		this.myArr = myArr;
	}
	public int[] getMoveZeros(){
		int index = 0;
		for(int i = 0 ; i < myArr.length ; i++){
			if(myArr[i] != 0){
				myArr[index] =  myArr[i];
				index++;
			}
		}
		while(index < myArr.length){
			myArr[index] = 0;
			index++;
		}
		return myArr;
	}
}
public class MoveZerosToLastApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		
		System.out.println("Enter array elements");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		
		MoveZeros mz = new MoveZeros();
		mz.setArray(arr);
		int result[] = mz.getMoveZeros();
		
		for(int i = 0 ; i < result.length ; i++){
			System.out.print(result[i]+" ");
		}
	}
}