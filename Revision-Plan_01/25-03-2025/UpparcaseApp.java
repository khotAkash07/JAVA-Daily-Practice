import java.util.Scanner;

class Upparcase{
	
	char ch[];
	
	Upparcase(char ch[]){
		this.ch = ch;
	}
	public char [] getUpparcase(){ 
		System.out.println("------------------------------------------");
		for(int i = 0 ; i < ch.length ; i++){
			if((ch[i] >= 'a' && ch[i] <= 'z')){
				ch[i] -= 32;
			}
		}
		return ch;
	}
}
public class UpparcaseApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		char ch[] = new char[10];
		
		System.out.println("Enter characters with some words");
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		Upparcase uc = new Upparcase(ch);
		char result[] = uc.getUpparcase();
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
	}
}