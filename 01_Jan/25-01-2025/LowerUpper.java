import java.util.Scanner;
public class LowerUpper{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter any character to check vowel or not : "); 
		int myChar = sc.next().charAt(0);
		
		if(myChar >= 'a' && myChar <= 'z' ){
			System.out.println("Given character is lowercase ");
		}
		else{
			System.out.println("Given character is uppercase ");
		}
	}
}