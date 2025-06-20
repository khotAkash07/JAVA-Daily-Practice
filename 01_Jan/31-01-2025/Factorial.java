/*************
Note: In each program take input from user
1) find the factorial of a number
4) check whether number is prime.
5) check whether number is composite or not

************/

import java.util.Scanner;

public class Factorial{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number to find Factorial : ");
		int num = sc.nextInt();
		int copy1 = num;
		// ------ Factorial ------ 
		int fact = 1;
		while(num > 0){
			fact *= num;
			num--;
		}
		System.out.println("The factorial of given number is = "+fact);
		
		// ------ prime or not ------ 
		int count = 0;
		int copy2 = copy1;
		while(copy1 > 0){
			if(copy2 % copy1 == 0){
				count++;
			}
			copy1--;
		}
		if(count == 2){
				System.out.println("Given number is prime");
		}else{
			System.out.println("Given number is composite");
		}
	}
}
