/**********************************************************************
Q1. WAP to create class name as Perfect with two methods 
void setNum(int no): this function can accept number as parameter 
void findPerfect(): this function can check number is perfect or not
**********************************************************************/

import java.util.Scanner;

class Perfect{
	int n;
	void setNum(int no){
		n = no;
	}
	void findPerfect(){
		int sum = 0;
		boolean flag = false;
		for(int i = 1 ; i <= n/2 ; i++){
			if(n % i == 0){
				sum += i;
			}
		}
		if(sum == n)
			flag = true;
		
		if(flag)
			System.out.println("The given number is perfect number");
		else
			System.out.println("The given number is not a perfect number");
	}
}
public class PerfectApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check perfect or not");
		int myNum = sc.nextInt();
		
		Perfect p = new Perfect();
		p.setNum(myNum);
		p.findPerfect();
	}
}
