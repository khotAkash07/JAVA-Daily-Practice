import java.util.*;

public class Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check Prime or Not :");
		int n = sc.nextInt();
		boolean flag = false;
		for(int i = 2 ; i<= n/2 ; i++){
			if(n % i == 0)
				flag = true;		
		}
		if(flag)
			System.out.println("Given number is not a prime number");
		else
			System.out.println("Given number is a prime number");
	}
}