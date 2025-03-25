//4. Check Number Is Strong Number or Not..
import java.util.Scanner;
public class Strong{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter number to check Strong or not :");
		int myNum = sc.nextInt();
		int rem = 0;
		int temp = myNum;
	
		int sum=0;
		for(;myNum > 0 ; myNum/=10){
				int fact = 1;
			rem = myNum%10;
			
			for(int i = 1; i<= rem ; i++){
				fact *= i;
				//System.out.println("---"+fact);
			}
			System.out.println("---"+fact);
			sum += fact;
		}
		if(sum == temp)
			System.out.print("number is  Strong :");
		else
			System.out.print("number is not Strong :");
	}
}