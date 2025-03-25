import java.util.Scanner;

public class SimpleCalculatorApp{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sing which you want to perform :");
		String sign = sc.next();
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		
		String result = sign.equals("+") ? "Addition = "+(a + b) : "Wrong input";
		System.out.println(result);
	}
}