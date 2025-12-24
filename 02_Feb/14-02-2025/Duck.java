import java.util.*;

public class Duck{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to check Prime or Not :");
		int n = sc.nextInt();
		boolean flag = false;
		int rem = 0;
		for(int i = n ;i>0 ; n=n/10){
			rem = n%10;
			if(rem == 0){
				flag = true;
			}						
		}
		if(flag)
			System.out.println("Given number is Duck number");
		else
			System.out.println("Given number is not a duck number");
	}
}