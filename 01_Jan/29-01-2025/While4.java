/*********
Write a program to find the sum of all even numbers from 1 to 10
*********/

public class While4{
	public static void main(String args[]){
		
		int i = 2;
		int sum = 0;
		while(i <= 10){
			sum += i;
			i +=2;
		}
		System.out.print(" "+sum);
	}
}