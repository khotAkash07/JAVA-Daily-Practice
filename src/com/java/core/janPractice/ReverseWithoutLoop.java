import java.util.*;

public class ReverseWithoutLoop{
	
	static int reverse(int val, int rev){
		if(val == 0) return rev;
		
		return reverse(val/10, rev*10 + val % 10);
	}
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to reverse");
		System.out.println(reverse(sc.nextInt(),0));
	}
}