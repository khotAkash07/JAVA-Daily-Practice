import java.util.Scanner;

public class PrimeNum{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Any number :");
		int myNum = sc.nextInt();
		
		for(int i = 1 ; i <= myNum ; i++)
		{
			boolean flag = false;
			for(int j = 2 ; j<= i/2 ; j++){
			
				if(i % j == 0){
					flag = true;
				}
			}
			
			if(flag){
				System.out.print("");
			}else{
				System.out.println(i);
			}
		}
	}
}
				