import java.util.*;
public class FindFirstAndLast{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any value");
		int val = sc.nextInt();
		System.out.println("First value : "+(String.valueOf(val).charAt(0)-'0')+"\tLast Value : "+val%10);
		
		
	}
}