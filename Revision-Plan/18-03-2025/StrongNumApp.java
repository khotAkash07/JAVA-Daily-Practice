import java.util.Scanner;
public class StrongNumApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Number to find strong or not ");
		int myNum = sc.nextInt();
		int rem = 0;
		int sum = 0;
		int copy = myNum;
		
		while(myNum > 0){
			rem = myNum%10;
			int fact = 1;
			for(int i = 1 ; i <= rem ; i++){
				fact *= i;
			}
			sum += fact;
			myNum /= 10;
		}
		if(sum == copy){
			System.out.println("Given number is strong number");
		}else{
			System.out.println("Given number is not a strong number");
		}
	}
}	