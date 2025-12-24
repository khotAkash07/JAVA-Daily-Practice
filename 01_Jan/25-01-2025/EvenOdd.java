import java.util.Scanner;
public class EvenOdd{
	public static void main(String arg[]){
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Any number to check Even or Odd :");
		 int myNum = sc.nextInt();
		 
		 if(myNum%2 == 0){
			 System.out.println("Given number is Even : ");
		 }
		 else{
			  System.out.println("Given number is Odd : ");
		 }
	}
}
		 