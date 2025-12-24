/*********************************************
Q4. WAP to create class name as Duck with two functions 
  void setValue(int no): this function is used for accept number as parameter 
  void checkDuck(): this function is used for check number is duck or not
*********************************************/
import java.util.Scanner;

class Duck{
	int num;
	void setValue(int no){
		num = no;
	}
	void checkDuck(){
		boolean flag = false;
		int rem = 0;
		while(num > 0 ){
			rem = num % 10;
			if(rem == 0){
				flag = true;
				break;
			}
			num /= 10;
		}
		if(flag)
			System.out.println("Number is duck number");
		else
			System.out.println("Number is not duck number");				
	}
}
public class DuckApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number to check duck or not");
		int myNum = sc.nextInt();
		
		Duck dc = new Duck();
		dc.setValue(myNum);
		dc.checkDuck();
	}
}