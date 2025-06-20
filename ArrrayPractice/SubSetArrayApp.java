import java.util.Scanner;

class SubSetArray{
	int arr01[];
	int arr02[];
	int count = 0;
	public void setArray(int arr01[], int arr02[]){
		this.arr01 = arr01;
		this.arr02 = arr02;
	}
	
	public void checkSubSet(){
		for(int i = 0 ; i < arr01.length ; i++){
			for(int j = 0 ; j < arr02.length ; j++){
				if(arr01[i] == arr02[j]){
					count++;
					break;
				}
			}
		}
		if(count == arr01.length){
			System.out.println("Array 01 is a subset of Array 02");
		}else{
			System.out.println("Array 01 is not a subset of Array 02");
		}
	}
}
public class SubSetArrayApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int arr1[] = new int[5];
		int arr2[] = new int[7];
		
		System.out.println("Enter First array elements");
		for(int i = 0 ; i < arr1.length ; i++){
			arr1[i] = sc.nextInt();
		}
		System.out.println("Enter second array elements");
		for(int i = 0 ; i < arr2.length ; i++){
			arr2[i] = sc.nextInt();
		}
		
		SubSetArray sa = new SubSetArray();
		sa.setArray(arr1, arr2);
		sa.checkSubSet();
	}
}