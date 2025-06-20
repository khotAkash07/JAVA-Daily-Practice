import java.util.Scanner;

class ReArrage{
	int myArr[];
	boolean flag;
	void setArray(int a[]){
		myArr = a;
	}
	
	
	void reArrage(){
		
		
		for(int i = 0 ; i < myArr.length ; i++){
			System.out.print(myArr[i]+"\t");
		}
		
		for(int i = 0 ; i < myArr.length ; i++){
			for(int j = 0 ; j < myArr.length ; j++){
				if((i == j)&&(myArr[j] == i)){
					break;
				}else if(myArr[j] == i){
						int temp = myArr[i];
						myArr[i] = myArr[j];
						myArr[j] = temp;
						
						flag = true;
				}
			}
			if(flag){}else{
				myArr[i] = -1;
			}				
		}
		System.out.println("\nRearranged elements");
		for(int i = 0 ; i < myArr.length ; i++){
			System.out.print(myArr[i]+"\t");
		}
	}
}
public class ReArrangeApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[]{-1, -1, 6, 1, 9, 3, 2, -1, 4, -1};
				
		ReArrage ra = new ReArrage();
		ra.setArray(arr);
		ra.reArrage();
	}
}