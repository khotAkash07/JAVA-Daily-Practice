/**********
Q3. Write a C program to input basic salary of an employee and calculate its Gross salary according to following:
		Basic Salary <= 10000 : HRA = 20%, DA = 80%
		Basic Salary <= 20000 : HRA = 25%, DA = 90%
		Basic Salary > 20000 : HRA = 30%, DA = 95%

***********/

import java.util.Scanner;

public class Salary{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		Double hra,da;
		String result = salary <= 10000 ? "HRA = "+(salary/100)*20 +"DA = "+(salary/100)*80 :  salary <= 20000 ? "HRA = "+(salary/100)*25 +" And DA = "+(salary/100)*90 : "HRA = "+(salary/100)*30 +"DA = "+(salary/100)*95  ;    
		System.out.println(result);
	}
}