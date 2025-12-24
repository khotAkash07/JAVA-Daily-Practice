//1. Write a java program to check whether number is prime or not, if it is prime then return true otherwise return false.
import java.util.Scanner;
class Prime{
	int num;
	public void setNum(int num){
		this.num = num;
	}
	public boolean getPrime(){
		boolean flag = false;
		for(int i = 2 ; i < num/2 ; i++){
			if(num % i == 0){
				flag = true;
				break;
			}
		}
		if(flag)return false;
		return true;
	}
}
public class PrimeApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number to check prime");
		int num = sc.nextInt();
		Prime p = new Prime();
		p.setNum(num);
		boolean result = p.getPrime();
		System.out.println((result)?"Given num is prime":"given num is not prime");
	}
}