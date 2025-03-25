import java.util.Scanner;
public class MaxFromTwo{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number A = ");
		int a = sc.nextInt();
		System.out.println("Enter First Number B = ");
		int b = sc.nextInt();
		
		if(a > b )
			System.out.println("A is greter than B");
		else if(b > a)
			System.out.println("B is greter than A");
		else
			System.out.println("A and B are equal");
	}
}