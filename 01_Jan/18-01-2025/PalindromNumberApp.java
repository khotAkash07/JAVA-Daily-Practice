// Palindrom or Not
import java.util.Scanner;

public class PalindromNumberApp{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Three digit number for checking Palindrom Number :");
		int n = sc.nextInt();
		int temp = n;
		int temp2 = (n % 10)*100 + ((n/10)%10)*10 + n/100;   		
		
		String result = (temp2==temp) ? "Number is Palindrom" : "Number is not Palindrom";
		System.out.println(result);
	}
}