import java.util.Scanner;

public class CreditScore{
	public static void main(String ar[]){
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Credit Score");
		int c_Score = sc.nextInt();
		
		String result = 1000=>c_Score > 750&& "Yes" : "No";
		
		System.out.println(result);
	}
}