//Q5.  Write a Java program to reverse a number without using loop.
//			Input a number: 123
	//		Reverse number: 321
	
import java.util.*;

public class ReverseWithoutLoop{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any three digit value to reverse it :");
		int n = sc.nextInt();
		
		int result = (n%10)*100 + ((n/10)%10)*10 + (n/100);
		
		System.out.println("The sum of given number is = "+result);
	}
}
