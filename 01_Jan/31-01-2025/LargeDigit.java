/*
3) find largest digit
6) count number of digits of a number
8) Reverse a number
*/

import java.util.Scanner;
public class LargeDigit{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number to find large digit : ");
		int num = sc.nextInt();
		int copy1 = num;
		int copy2 = copy1;
		int count = 0;
		int rem =0;
		int  max = 0; 
		
		// ------ max from Digit ------ 
		while(num > 0){
			count++;
			rem = num%10;
			if(rem > max){
				max = rem;
			}
			num /=10;
		}
		//System.out.println("The Sum of given number is = "+max);
		
		// ------ Count the digit ------ 
		
		
		//System.out.println("The count of given number is ="+count);
		//System.out.println("The Copy of given number is ="+copy1);
		
		// Reverse a number
		
		int rem2 = 0;
		int rev = 0;
		while(copy1 > 0){
			rem2 = copy1%10;
			
			rev =(rev* 10) + rem2;
			copy1 /= 10;
		}
		System.out.println("The reverse number is = "+rev);
		

		int evenSum = 0;
		int oddSum = 0;
		int rem3 = 0;
		while(copy2 > 0){
			rem3 = copy2%10;
			if(rem3%2==0){
				evenSum += rem3;
			}
			else{
				oddSum += rem3;
			}
			copy2 /= 10;
		}
		System.out.println("The even sum of number is = "+evenSum);
		System.out.println("The odd sum of number is = "+oddSum);
			
	}
}