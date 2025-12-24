import java.util.Scanner;

public class MaxBtnThree{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First value :");
		int fNum = sc.nextInt();
		System.out.println("Enter second value :");
		int sNum = sc.nextInt();
		System.out.println("Enter Third value :");
		int tNum = sc.nextInt();
		
		if(fNum > sNum && fNum > tNum){
			System.out.println("First number is Greter");
		}else if(sNum > tNum){
			System.out.println("second number is Greter");
		}else{
		System.out.println("Third number is Greter");
		}
	}
}