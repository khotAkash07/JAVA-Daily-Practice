import java.util.Scanner;

class EvenOdd{
	int num01;
	public void setNum(int num01){
		this.num01 = num01;
	}
	public void checkEvenOdd(){
		System.out.println((num01%2==0)?"Number is even":"number is odd");
	}
}
public class EvenOddApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int num01 = sc.nextInt();
		
		EvenOdd cm = new EvenOdd();
		cm.setNum(num01);
		cm.checkEvenOdd();
	}
}	