/*
2) find sum of digits
3) calculate power of a number
*/

import java.util.Scanner;
public class Sum{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number to find sum : ");
		int num = sc.nextInt();
		System.out.print("Eneter a power : ");
		int power = sc.nextInt();
		int num2 = num;
		
		int sum = 0;
		while(num > 0){
			sum += num;
			num--;
		}
		System.out.println("The Sum of given number is = "+sum);
		
		// calculate power of a number
		int p = 1;
		while(power >0){
			p *= num2;
			power--;
		}	
		System.out.println("The power of given number is = "+p);
		
	}
}