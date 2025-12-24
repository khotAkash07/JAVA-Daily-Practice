import java.util.*;

public class AschiiValue{
	public static void main(String ar[]){
		
	Scanner sc = new Scanner(System.in);
	
	// For Character to int Ascii value
	System.out.println("Enter any character :");
	char ch = sc.next().charAt(0);
	System.out.println("Aschii value of Character="+(int)ch);
	
	//For integer value to character ascii value
	
	System.out.println("Enter any Integer value :");
	int num = sc.nextInt();
	System.out.println("The character of given number ="+(char)num);
	}
}
	