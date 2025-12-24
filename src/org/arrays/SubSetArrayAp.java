import java.util.Scanner;

class SubSetArray{
	int arr01[];
	int arr02[];
	boolean flag = true;
	public void setArray(int arr01[], int arr02){
		this.arr01 = arr01;
		this.arr02 = arr02;
	}
	
	public void checkSubSet(){
		for(int i = 0 ; i < arr01.length ; i++){
			for(int j = 0 ; j < arr02.length ; j++){
				if(arr01[i] == arr02[j]){
					flag = false;
				}
			}
		}
		if(flag){
			System.out.println("Array 01 is a subset of Array 02");
		}else{
			System.out.println("Array 01 is not a subset of Array 02");
		}
	}
}