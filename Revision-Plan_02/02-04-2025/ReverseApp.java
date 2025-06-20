import java.util.Scanner;
class Reverse{
	int num;
	public void setValue(int num){
		this.num = num;
	}
	public void showRev(){
		int rev = 0;
		int rem = 0;
		while(num > 0){
			rem = num % 10;
			rev = rev*10+rem;
			num /= 10;
		}
		System.out.println("Reverse number = "+rev);
	}
}
public class ReverseApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to reverse");
		int num = sc.nextInt();
		
		Reverse t = new Reverse();
		t.setValue(num);
		t.showRev();
	}
}
