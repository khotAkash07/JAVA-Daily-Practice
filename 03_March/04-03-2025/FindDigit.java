/********************************************
Q2. WAP to create character array of size 15 
and extract digit from character array and 
calculate sum of that digit
***********************************************/

import java.util.Scanner;

public class FindDigit{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[5];
		
		System.out.println("Enter 15 Characters with digits :");
		
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		System.out.println("15 Characters with digits :");
		
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
		int sum = 0;
		for(int i = 0 ; i < ch.length ; i++){
			
			if(ch[i] > '0' && ch[i] <= '9'){
				sum += ch[i];
			}
		}
		System.out.println("The sum of digits = "+sum);
	}
}
