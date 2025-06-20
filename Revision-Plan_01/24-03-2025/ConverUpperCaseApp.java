import java.util.Scanner;

class ConverUpperCase{
	char ch[];
	public void setArr(char ch[]){
		this.ch = ch;
	}
	public void getWords(){
		System.out.println("------------------------------------------------------------");
		for(int i = 0 ; i < ch.length ; i++){
			if(ch[i] >= 'a' && ch[i] <= 'z'){
				System.out.printf("%c",ch[i]-32);
			}else{
				System.out.println(ch[i]);
			}
		}
	}
}
public class ConverUpperCaseApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		char ch[] = new char[10];
		System.out.println("Enter characters for array");
		for(int i = 0 ; i < ch.length ; i++){
			ch[i] = sc.next().charAt(0);
		}
		ConverUpperCase cuc = new ConverUpperCase();
		cuc.setArr(ch);
		cuc.getWords();
	}
}