import java.util.*;

public class SkyNumApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to check spy or not ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;
		
		while(num > 0){
			int rem = num%10;
			sum += rem;
			product *= rem;
			num /= 10;
		}
		
		System.out.println(sum==product?"Number is spy":"Number is not spy");
		
	}
}