import java.util.Scanner;

class FindWords{
	
	char ch[];
	
	public void setArr(char ch[]){
		this.ch = ch;
	}
	public void getWords(){  // A b c 4 t 
		System.out.println("------------------------------------------");
		for(int i = 0 ; i < ch.length ; i++){
			if((ch[i] >= 'A' && ch[i] <= 'Z')||(ch[i] >= 'a' && ch[i] <= 'z')){
				System.out.println(ch[i]);
			}
		}
	}
}
public class FindwordsApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		char ch[] = new char[10];
		
		System.out.println("Enter characters with some words");
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		
		FindWords fw = new FindWords();
		fw.setArr(ch);
		fw.getWords();
	}
}