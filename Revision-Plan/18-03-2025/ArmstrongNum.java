import java.util.Scanner;

public class ArmstrongNum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check armstrong :");
		int myNum = sc.nextInt();
		int rem = 0;
		int mySum = 0;
		int copy = myNum;
		int count = 0;
		while(myNum > 0){
			rem = myNum%10;
			count++;
			myNum /= 10;
		}
		myNum = copy;
		//System.out.println(count);
		while(myNum > 0){
			int sum = 1;
			rem = myNum%10;
			for(int i = 0 ; i < count ; i++){
				sum *= rem;				
			}
			mySum += sum;
			myNum /= 10;
		}
		if(mySum == copy){
			System.out.println("Given number is armstrong number");
		}else{
			System.out.println("Given number is not a armstrong number");
		}
			
	}
}
			