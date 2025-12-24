//2. Write a java program to count the digit of number using function recursion and return its count of number.
import java.util.Scanner;
class Recursion{
	int count = 0;
	public int getRec(int num){
		count++;
		num /= 10;
		if(num > 0)getRec(num);
		return count;
	}		
}
public class RecursionApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number for count the digit");
		int num = sc.nextInt();
		Recursion rc = new Recursion();
		System.out.println("The count of digit for given number = "+rc.getRec(num));
	}
}