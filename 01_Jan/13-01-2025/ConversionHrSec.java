import java.util.*;

//Write a Java program to convert seconds to hours, minutes and seconds.
public class ConversionHrSec{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Seconds :");
		
		int Givensec = sc.nextInt();
			
		int hrs = Givensec/3600;
		int min = (Givensec-3600)*hrs/60;
		int sec = Givensec%60;
			
			System.out.println("The conversion of "+Givensec+" seconds is ="+hrs+" hours "+min+" minutes and "+sec+" Seconds");
	}
}