import java.util.*;

public class Divid{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number for check division : ");
		
		int n = sc.nextInt();
		
		String result = n % 5 == 0 && n % 11 == 0 ? "This number is divsible by 5 and 11" : "This number is not divsible by 5 and 11";
		System.out.println(result);
		
		String result2 = n >= 18 ? "You are eligible for voting" : "You are not eligible for voting";
		System.out.println(result2);
	
	}
}
		