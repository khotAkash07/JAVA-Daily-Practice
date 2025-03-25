import java.util.*;

public class PosiNigative{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any number to check positive or negative : ");
		int n = sc.nextInt();
				
		if(n > 0)
			System.out.println(" Congratulation.....!!! Your number is positive");
		else
			System.out.println("Your number is not positive");
	}
}