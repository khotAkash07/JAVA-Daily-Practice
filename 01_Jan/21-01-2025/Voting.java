import java.util.*;

public class Voting{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your age : ");
		int age = sc.nextInt();
		if(age > 18)
			System.out.println(" Congratulation.....!!! You are eligible for voting");
		else
			System.out.println("You are not eligible for voting");
	}
}