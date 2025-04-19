import java.util.Scanner;

class Calculator{
	int a;
	int b;
	public void setNum(int a, int b){
		this.a = a;
		this.b = b;
	}
	public int addtion(){
		return a+b;
	}
	public int subtraction(){
		return a-b;
	}
	public int multipl(){
		return a*b;
	}
	public int divide(){
		return a/b;
	}
	public int mod(){
		return a%b;
	}
}
public class CalculatorApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter value for A");
		int a = sc.nextInt();
		System.out.println("Enter value for B");
		int b = sc.nextInt();
		
		Calculator cl = new Calculator();
		cl.setNum(a,b);
		System.out.println("Addition = "+cl.addtion());
		System.out.println("Subtraction = "+cl.subtraction());
		System.out.println("division = "+cl.divide());
		System.out.println("multiplication = "+cl.multipl());
		System.out.println("Modulo Division = "+cl.mod());
	}
}
	