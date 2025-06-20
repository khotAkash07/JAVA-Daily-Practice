import java.util.Scanner;

class Findwords{
	char ch[];
	public void setArr(char ch[]){
		this.ch = ch;
	}
	public void getWords(){
		for(int i = 0 ; i < ch.length ; i++){
			System.out.println(ch[i]);
		}
		System.out.print("----------------------------------------------\n");
		for(int i = 0 ; i < ch.length ; i++){
			if((ch[i] >= 'A' && ch[i] <= 'Z')||(ch[i] >= 'a'  ch[i] <= 'z')){
				System.out.print(ch[i]+" ");
			}
		}
	}
}
public class FindWordsApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		char ch[] = new char[10];
		System.out.println("Enter characters for array");
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		Findwords fw = new Findwords();
		fw.setArr(ch);
		fw.getWords();
	}
}