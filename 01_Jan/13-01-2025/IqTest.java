import java.util.Scanner;

public class IqTest{
	public static void main(String ar[]){
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter chef`s current iQ : ");
		int c_iq = sc.nextInt();
		
		int Einstein = 170;
		
		
		String result =  c_iq < 170 && (c_iq+7) > Einstein ? "Yes" : "No";
		
	System.out.println(result);
	}
}