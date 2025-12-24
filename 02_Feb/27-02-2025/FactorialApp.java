/********************************
Q3. WAP to create class name as Factorial with two functions 
   void setNum(): this function can accept number as parameter.
   void showFactorial(): this function is used for calculate factorial of number and  display it.
********************************/
import java.util.Scanner;
class Fact{
	int n;
	void setNum(int num){
		n = num;
	}
	void showFactorial(){
		int totalFact = 1;
		for(int i = 1 ; i <= n ; i++){
			totalFact *= i;
		}
		System.out.println("Factorial of "+n+" is = "+totalFact);
	}
}
public class FactorialApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any Value");
		int myNum = sc.nextInt();
		
		Fact fact = new Fact();
		fact.setNum(myNum);
		fact.showFactorial();
	}
}