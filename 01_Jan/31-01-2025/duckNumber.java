/*********************************************************************
10) Check whether a number is duck or not
**********************************************************************/


import java.util.Scanner;
public class Sum{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Eneter a number to find duck number : ");
		int num = sc.nextInt();		
		
		int sum = 0;
		while(num > 0){
			sum += num;
			num--;
		}
		System.out.println("The Sum of given number is = "+sum);
		
		
	}
}