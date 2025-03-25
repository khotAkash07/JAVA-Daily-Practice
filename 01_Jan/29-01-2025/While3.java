/*********
Write a program to find the sum of all natural numbers from 1 to 10
*********/
public class While3{
	public static void main(String args[]){
		
		int i = 1;
		int sum = 0;
		while(i <= 10){
			sum +=i;
			i++;
		}
		System.out.print(" "+sum);
	}
}