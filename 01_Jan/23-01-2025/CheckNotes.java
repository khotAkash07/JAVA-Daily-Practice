import java.util.Scanner;

public class CheckNotes{
	public static void main(String ar[]){
		
		int r500,r200,r100,r50,r20,r10;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your rupee :");
		int value = sc.nextInt();
		
		if(value >= 500){
			r500 = value/500;
			value %= 500;
			System.out.println("rs500 = "+r500);
			
		}
		if(value >= 200){
			r200 = value/200;
			value %= 200;
			System.out.println("rs200 = "+r200);
		}
		if(value >= 100){
			r100 = value/100;
			value %= 100;
			System.out.println("rs100 = "+r100);
		}
		if(value >= 50){
			r50 = value/50;
			value %= 50;
			System.out.println("rs50 = "+r50);
		}
		if(value >= 20){
			r20 = value/20;
			value %= 20;
			System.out.println("rs20 = "+r20);
		}
		if(value >= 10){
			r10 = value/10;
			value %= 10;
			System.out.println("rs10 = "+r10);
		}
		if (value < 10){
			System.out.println("Change = "+value);
		}
	}
}