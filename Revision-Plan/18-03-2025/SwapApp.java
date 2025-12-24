import java.util.Scanner;

public class SwapApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 4 or more digit number for swapping ");
		int myNum = sc.nextInt();
		int copy = myNum;
		int count = 0;
		int rem = 0;
		
		while(myNum > 0){
			rem = myNum%10;
			myNum /= 10;
			count++;
		}
		int arr[] = new int[count];
		
		myNum =copy;
		int i = arr.length - 1;
		while(myNum > 0){
			rem = myNum%10;
			arr[i] = rem;
			i--;
			myNum /= 10;
		}
		
		//12345 --> 45312
		
		int a = 0;
		int b = arr.length - 1;
		while(a < 2){
			if(a == 0){				
				int temp = arr[a];
				arr[a] = arr[b-1];
				arr[b-1] = temp;
			}else{
				int temp = arr[a];
				arr[a] = arr[b];
				arr[b] = temp;
			}
			a++;			
		}
		for(int j = 0 ; j < arr.length ; j++){
			System.out.print(arr[j]+"\t");
		}	
			
			
	}
}