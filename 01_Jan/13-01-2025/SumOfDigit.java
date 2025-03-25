//Write a Java program and compute the sum of an integer's digits.
//			Input : 123
//			Output : 6

import java.util.*;

public class SumOfDigit{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any three digit value to find Sum :");
		int n = sc.nextInt();
		
		int result = (n%10) + ((n/10)%10) + (n/100);
		
		System.out.println("The sum of given number is = "+result);
	}
}