import java.util.Scanner;
class Factorial{
	int num;
	public void setValue(int num){
		this.num = num;
	}
	public void showFactorial(){
		int fact = 1;
		for(int i = 1 ; i <= num ; i++){
			fact = fact*i;
		}
		System.out.println("Factorial of given number = "+fact);
	}
}
public class FactorialApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to show table");
		int num = sc.nextInt();
		
		Factorial t = new Factorial();
		t.setValue(num);
		t.showFactorial();
	}
}
