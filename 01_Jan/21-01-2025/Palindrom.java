import java.util.*;

public class Palindrom{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 4 digit Number for checking palindrom or not : ");
		int n = sc.nextInt();
		int temp = n;
		
		int pali = (n%10)*1000 + ((n/10)%10)*100 + ((n/100)%10)*10 + n/1000;
		
		if(pali == temp)
			System.out.println(" Congratulation.....!!! Your number is palindrom");
		else
			System.out.println("Your number is not palindrom");
	}
}