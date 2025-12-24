import java.util.Scanner;
public class LeapYear{
	public static void main(String ar[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Eneter any Year : "); 
		int myYear = sc.nextInt();
		
		if(myYear % 4 == 0){
			System.out.println("Given Year is leap year ");
		}
		else{
			System.out.println("Given year not leap year  ");
		}
	}
}