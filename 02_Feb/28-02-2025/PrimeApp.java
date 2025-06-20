/*******************************
Q3. WAP to create class name as Prime with two functions 
void setValue(int no): this function is used for accept number as parameter 
void checkPrime(): this function can check number is prime or not 
********************************/
import java.util.Scanner;
class Prime{
	int n;
	void setValue(int no){
		n = no;
	}
	
	void checkPrime(){
		boolean flag = false;
		for(int i = 2 ; i <= n/2 ; i++){
			if(n % i == 0)
				flag = true;
		}
		if(flag)
			System.out.println("Given number is not a prime number");
		else
			System.out.println("Given number is a prime number");
	}
}
public class PrimeApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check prime or not");
		int myNum = sc.nextInt();
		Prime pr = new Prime();
		pr.setValue(myNum);
		pr.checkPrime();
	}
}