import java.util.Scanner;

public class PosiNegaZero{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
	String result = n > 0 ? "Given number is positive" : n < 0 ? "given number is negative" : "Given number is zero";
	
	System.out.println(result);
	}
}