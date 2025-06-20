/*****************
Q2. WAP to create class name as Power with function 
  void setNum(): this function accept two values first is base and second is index 
  void showPower(): this function can calculate the power of two numbers and display it.
****************/
import java.util.Scanner;
class Power{
	int num;
	int pow;
	void setNum(int num1, int pow1){
		num = num1;
		pow = pow1;
	}
	void showPower(){
		int power1 = 1;
		for(int i = 1 ; i <= pow ; i++){
			power1 *= num;
		}
		System.out.println("The Power of given number is = "+power1);
	}
}
public class PowerApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Number :");
		int myNum = sc.nextInt();
		System.out.println("Enter power of Number :");
		int myPow = sc.nextInt();
		
		Power p = new Power();
		p.setNum(myNum,myPow);
		p.showPower();
		
	}
}