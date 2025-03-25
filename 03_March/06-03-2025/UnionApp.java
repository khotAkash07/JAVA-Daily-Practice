import java.util.Scanner;

class Union{
	int arr1[];
	int arr2[];
	int arrUnion[] = new int[10];
	void setArray(int a[], int b[]){
		arr1 = a;
		arr2 = b;
	}
	
	void checkMejority(){
		for(int i = 0 ; i < arr1.length ; i++){
			int count = 1;
			for(int j = i + 1; j < arr2.length ; j++){
				if(arr1[i] == arr1[j])
					count++;
			}
			if(count > (arr1.length/2)){
				System.out.println("Mejority element of first array is = "+arr1[i]);
			}
		}
		for(int i = 0 ; i < arr2.length ; i++){
			int count = 1;
			for(int j = i + 1; j < arr2.length ; j++){
				if(arr2[i] == arr2[j])
					count++;
			}
			if(count > (arr2.length/2)){
				System.out.println("Mejority element of second array is = "+arr2[i]);
				break;
			}
		}
	}
	void checkUnion(){
		int count = 0;
		for(int i = 0 ; i < arr1.length ; i++){
			for(int j = 0 ; j < arr2.length ; j++){
				if(arr1[i] == arr2[j]){
					arrUnion[count] = arr1[i];
					count++;
				}
			}
		}
		System.out.println("Union array is = ");
		for(int i = 0 ; i < count ; i++){
			System.out.println(arrUnion[i]);
		}
	}
}
public class UnionApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int myArr1[] = new int[10];
		System.out.println("Enter first Array elements : ");
		for(int i = 0 ; i < myArr1.length ; i++){
			myArr1[i] = sc.nextInt();
		}
		
		int myArr2[] = new int[10];
		System.out.println("Enter second Array elements : ");
		for(int i = 0 ; i < myArr2.length ; i++){
			myArr2[i] = sc.nextInt();
		}
		
		Union un = new Union();
		un.setArray(myArr1, myArr2);
		un.checkMejority();
		un.checkUnion();
	}
}
		