import java.util.Scanner;

public class SimpleCalculatorApp{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		String sign = sc.nextInt();
		
		int result = sign == "+" ? a + b : "";
		System.out.println(result);
	}
}