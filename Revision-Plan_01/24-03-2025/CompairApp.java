import java.util.Scanner;

class Compair{
	int num01;
	int num02;
	public void setNum(int num01, int num02){
		this.num01 = num01;
		this.num02 = num02;
	}
	public void checkCompair(){
		if(num01 > num02) System.out.println("The number 01 is greter than number 02");
		else if(num01 < num02)	System.out.println("The number 01 is less than number 02");
		else System.out.println("Both are equals");
	}
}
public class CompairApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num01 = sc.nextInt();
		System.out.println("Enter second Number");
		int num02 = sc.nextInt();
		
		Compair cm = new Compair();
		cm.setNum(num01,num02);
		cm.checkCompair();
	}
}	