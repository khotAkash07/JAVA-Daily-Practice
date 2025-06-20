import java.util.*;

public class TestCaseFirst{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount of First cab :");
		int first_cab = sc.nextInt();
		System.out.println("Enter amount of second cab :");
		int sec_cab = sc.nextInt();
		
		String result = first_cab < sec_cab ? "You go to First cab" : first_cab == sec_cab ? "You Go with any cab" : "you go with second cab";
			System.out.println(result);
	}
}