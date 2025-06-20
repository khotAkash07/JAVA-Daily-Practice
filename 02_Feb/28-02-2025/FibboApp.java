/**************************************
  Q5. WAP to create class name as Fibo with two functions 
void setLimit(int limit): this function is used for set the limit for fibonacci series 
void checkFibo(): this function can print the fibonacci series 
****************************************************************/
import java.util.Scanner;
class Fibo{
	
	int lim;
	void setLimit(int limit){
		lim = limit;
	}
	void checkFibo(){
		int a = 0;
		int b = 1;
		int c = 0;
		System.out.println("-------------------Fibbonacy series-------------------");
		while(lim > 0){
			System.out.println(c);
			a = b;
			b = c;
			c = a+b;
			lim--;
		}
	}
}
public class FibboApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit");
		int myNum = sc.nextInt();
		
		Fibo f = new Fibo();
		f.setLimit(myNum);
		f.checkFibo();
	}
}
