import java.util.Scanner;

public class NeonNumber{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number for checking Neon :");
		int n = sc.nextInt();
		System.out.println("Given Number = "+n);
		int square = n*n;
		System.out.println("Square of Given number = "+square);
		int temp = (square % 10) + (square/10);
		System.out.println("Temp Value =  "+temp);
		
		String result = (n==temp) ? "Number is Neon" : "Number is not neon";
		System.out.println(result);
	}
}