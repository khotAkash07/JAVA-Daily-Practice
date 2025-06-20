/*******************************
Q2. WAP to create class name Armstrong with two methods 
void setNum(int no): this function can accept number as parameter 
void checkArm(): this function can check number is armstrong or not 
********************************/
import java.util.Scanner;
class Armstrong{
	int n;
	
	void setNum(int no){
		n = no;
	}
	void checkArm(){
		int rem = 0;
		int sum = 0;
		int n1 = n;
		while(n > 0){
			rem = n % 10;
			int cube = 1;
			for(int i = 1 ; i <= 3 ; i++){
				cube *= rem;				
			}
			n /= 10;
			sum += cube;
		}
		if(sum == n1){
			System.out.println("Given Number is armstrong number");
		}else{
			System.out.println("Given number is not a armstrong number");
		}
	}
}
public class ArmstrongApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int myNum = sc.nextInt();
		
		Armstrong arm = new Armstrong();
		arm.setNum(myNum);
		arm.checkArm();
	}
}
		