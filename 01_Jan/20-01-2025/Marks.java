/**********
Q4. Write a C program to input marks of five subjects Physics, Chemistry, Biology, 
	    Mathematics and Computer, calculate percentage and grade according to given conditions:
		percentage >= 90% : Grade A
		percentage >= 80% : Grade B
		percentage >= 70% : Grade C
		percentage >= 60% : Grade D
		percentage >= 40% : Grade E
		percentage < 40% : Grade F

***********/

import java.util.Scanner;

public class Marks{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks 5 time :");
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int biology = sc.nextInt();
		int mathematic = sc.nextInt();
		int computer = sc.nextInt();
		
		double percent = (computer+mathematic+biology+chemistry+physics)/6;
		
		String result = percent >= 90 ? "Grade A" : percent >= 80 ? "Grade B" : percent >= 70 ? "Grade C" : percent >= 60 ? "Grade D" : "Grade F";
		System.out.println(result);
	}
}