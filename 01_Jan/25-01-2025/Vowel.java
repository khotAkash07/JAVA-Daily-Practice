import java.util.Scanner;
public class Vowel{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter any character to check vowel or not : "); 
		int myChar = sc.next().charAt(0);
		
		if(myChar == 'a' ||myChar == 'e' ||myChar == 'i' ||myChar == 'o' ||myChar == 'u' ||myChar == 'A' ||myChar == 'E' ||myChar == 'I' ||myChar == 'O' ||myChar == 'U' ||){
			System.out.println("Given character is vowel ");
		}
		else{
			System.out.println("Given character is not vowel ");
		}
	}
}