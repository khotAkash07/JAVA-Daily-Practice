import java.util.*;

public class Checkdigit{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter any character :");
		char ch = sc.next().charAt(0);
		
		if(ch >='0' && ch <= '9'){
			System.out.println("Given character is digit");
		}
		else{
			System.out.println("Given character is not digit");
		}
	}
}