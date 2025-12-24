import java.util.Scanner;
public class CharDigitSymbol{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter any character to check vowel or not : "); 
		int myChar = sc.next().charAt(0);
		
		if(myChar >= 'a' && myChar <= 'z' ){
			System.out.println("Given character is Alphabet ");
		}
		else if(myChar >= '0'&& myChar<= '9'){
			System.out.println("Given character is Digit ");
		}
		else{
			System.out.println("Given character is a Special symbol");
		}
	}
}