/****************************************************************************************
WAP to create class name as FindMax with two functions 
void setValue(int …x): this function accept infinite parameter from calling
int  getMax(): this function can find the value from the function and return it.
*****************************************************************************************/
import java.util.Scanner;

class FindMax{
	
	int arr[] = new int[10];
	
	void setValue(int ...x){		
		for(int i = 0 ; i < x.length ; i++){
			arr[i] = x[i];
		}
	}
	int getMax(){
		int max = 0;
		for(int i = 0 ; i < arr.length ; i++){
			if(max < arr[i])
				max = arr[i];
		}
		return max;
	}
}
public class MaxApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
	
		FindMax fm = new FindMax();
		fm.setValue(2,3,4,5,6,7,8);
		int result = fm.getMax();
		System.out.println("max value = "+result);
	}
}