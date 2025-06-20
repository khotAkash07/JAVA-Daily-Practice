//find Median from two array with odd numbers
import java.util.Scanner;

class Median{
	
	int myArr01[];
	int myArr02[];
	
	void setValue(int a[], int b[]){
		myArr01=a;
		myArr02=b;
	}
	void findMedian(){
		int mergedArray[] = new int[myArr01.length + myArr02.length];
		int count = 0;
		for(int i = 0 ; i < myArr01.length ; i++){
			mergedArray[count] = myArr01[i];
			count++;
		}
		for(int i = 0 ; i < myArr02.length ; i++){
			mergedArray[count] = myArr02[i];
			count++;
		}
		System.out.println("Merged Array = ");
		for(int i = 0 ; i < mergedArray.length ; i++){
			System.out.print(mergedArray[i]+"\t");
		}
		System.out.println("Sorted Array = ");
		for(int i = 0 ; i < mergedArray.length - 1 ; i++){
			for(int j = i+1 ; j < mergedArray.length ; j++){
				if(mergedArray[i] > mergedArray[j]){
					int temp = mergedArray[i];
					mergedArray[i] = mergedArray[j];
					mergedArray[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array = ");
		for(int i = 0 ; i < mergedArray.length ; i++){
			System.out.print(mergedArray[i]+"\t");
		}
		int index = mergedArray.length/2;
		System.out.println("\nMedian of given merged array = "+mergedArray[index]);
		
	}
}
public class FindMedianApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr01[] = new int[5];
		int arr02[] = new int[6];
		System.out.println("Enter First array elements ");
		for(int i = 0 ; i < arr01.length ; i++){
			arr01[i] = sc.nextInt();
		}
		System.out.println("Enter First array elements ");
		for(int i = 0 ; i < arr02.length ; i++){
			arr02[i] = sc.nextInt();
		}
		Median md = new Median();
		md.setValue(arr01, arr02);
		md.findMedian();
	}
}