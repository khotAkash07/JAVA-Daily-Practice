import java.util.Scanner;
class CountDigit{
	int num;
	public void setValue(int num){
		this.num = num;
	}
	public void showCountOfDigit(){
		int count = 0;
		while(num > 0){
			count++;
			num /= 10;
		}
		System.out.println("Count = "+count);
	}
}
public class CountDigitApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any number to reverse");
		int num = sc.nextInt();
		
		CountDigit t = new CountDigit();
		t.setValue(num);
		t.showCountOfDigit();
	}
}
