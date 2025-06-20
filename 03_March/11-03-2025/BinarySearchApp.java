/*************************************************************************
You have to create class name as BinarySearch with two methods 
void setArray(int a[]): this function is used for accept array as parameter 
int getIndex(int key): this function accepts a key for search and return index 
of search element and returns -1 when the element is not found and show the element 
at function calling point using index if index is not -1
*********************************************************************/
import java.util.Scanner;
class BinarySearch{
	int arr01[];
	void setArray(int a[]){
		arr01 = a;
	}
	int getIndex(int key){
		for(int i = 0 ; i < arr01.length ; i++){
			if(key == arr01[i]){
				return i;
			}	
		}	
		return -1;
	}
}
public class BinarySearchApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);		
		BinarySearch bs = new BinarySearch();
		int myArr[] = new int[6];
		System.out.println("Enter array element");
		
		for(int i = 0 ; i < myArr.length ; i++)
			myArr[i] = sc.nextInt();
		
		System.out.println("Enter key :");
		int key = sc.nextInt();
		bs.setArray(myArr);
		int result = bs.getIndex(key);
		
		if(result != -1)
			System.out.println(key +" is present in "+result+" index");
		else
			System.out.println(key +" is present in "+result+" index");
		
	}
}