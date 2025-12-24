import java.util.Scanner;
public class Divide{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter any number to check Divisiblity with 5 and 11 : "); 
		int myNum = sc.nextInt();
		
		if(myNum % 5 == 0 && myNum%11 == 0){
			System.out.println("Given number Divisible with 5 and 11 ");
		}
		else{
			System.out.println("Given number not divisible with 5 and 11  ");
		}
	}
}