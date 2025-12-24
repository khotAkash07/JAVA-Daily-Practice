import java.util.*;

public class PositiveNegative{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any number :");
		int n = sc.nextInt();

		
		
		if(n > 0){
			System.out.println("Positive");
		}
		else if(n < 0 ){
			System.out.println("Negative");
		}
		else{
			System.out.println("zero");
		}
	}
}