//2. Check Number Is Perfect Number or Not..

import java.util.Scanner;
public class Perfect{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number to check Number is pefect or not :");
		int myNum = sc.nextInt();
		int sum = 0;
		for(int i = 1 ; i <= myNum/2 ; i++){
			if(myNum % i == 0){
				sum += i;
			}
		}
		if(sum == myNum)
			System.out.print("Number is pefect....");
		else
			System.out.print("Number is not pefect...");
	}
}
