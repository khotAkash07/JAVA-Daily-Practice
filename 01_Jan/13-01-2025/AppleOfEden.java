import java.util.Scanner;

public class AppleOfEden{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no of Apples");
		int apples = sc.nextInt();
		
		System.out.println("Enter no of Guard");
		int guards = sc.nextInt();
		
		String result = 1<=guards<=apples? "yes" : "No";
		
		System.out.println(result);
	}
}
	
		