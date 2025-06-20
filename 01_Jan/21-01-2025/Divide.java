import java.util.*;

public class Divide{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any number : ");
		int n = sc.nextInt();
		if(n%3==0 && n%5==0)
			System.out.println("Given number is divisile by 3 and 5");
		else
			System.out.println("Given number is not divisile by 3 and 5");
	}
}