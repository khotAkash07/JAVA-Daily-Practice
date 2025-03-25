/**************************************************************
Q4. WAP to create  class name as Rev with two functions 
   void setValue(): this function is used for accept number 
   void showRev(): this function is used for reverse the number
**************************************************************/

import java.util.Scanner;

class Rev{
	int n;
	void setValue(int num){
		n = num;
	}
	void showRev(){
		int rem = 0;
		int rev = 0;
		while(n > 0){
			rem = n%10;
			rev = rev * 10 + rem;			
			n /= 10;
		}
		System.out.println("The Reverse number is = "+rev);
	}
}
public class ReverseApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any number to reverse :");
		int myNum = sc.nextInt();
		Rev rv = new Rev();
		rv.setValue(myNum);
		rv.showRev();
	}
}