/*********
Write a program to print all the numbers which are divisible by 3 and 5 from 1 to 100
*********/

public class While7{
	public static void main(String args[]){
		
		int i = 2;
		
		while(i <= 100){
			if(i % 3 == 0 && i % 5 == 0){
				System.out.print(" "+i);
			}
			i++;
		}
		
	}
}