//Q3. Write a Java program that reads a number and display the cube. 

import java.util.*;

public class Cube{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any value to find Cube :");
		int n = sc.nextInt();
		
		int result = n*n*n;
		
		System.out.println("The cube of given number is = "+result);
	}
}