import java.util.Scanner;

public class FindVowels{
	public static void main(String arg[]){
		
		char ch[] = {'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t'};
		boolean flag = false;
		System.out.println("\n----------------------------------------");
		for(int i = 0 ; i < ch.length ; i++){
			if(ch[i] == 'a' ||ch[i] == 'e' ||ch[i] == 'i' ||ch[i] == 'o' ||ch[i] == 'u'){
				System.out.print(ch[i]+"\t");
				flag =true;
			}
		}
		if(flag){}else{
			System.out.print("There is no any 'Vowel' Present in given array");
		}
		System.out.println("\n----------------------------------------");
	}
}	