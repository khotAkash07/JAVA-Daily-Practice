//Q1. WAP to create character array of size 5 
//and convert lower case character array to uppercase character array
import java.util.Scanner;
public class LowerToUpper{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[5];
		System.out.println("Enter 5 characters :");
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		
		//for(int i = 0 ; i < ch.length ; i++){
		//	ch[i] = Character.toUpperCase(ch[i]);
		//}
		System.out.println("UpparCase 5 characters is:");
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
	}
}