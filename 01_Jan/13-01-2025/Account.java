import java.util.Scanner;

public class Account{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		double Acc_balance = 200.00;
		System.out.println("Enter value of money for widrawal :");
		int amount = sc.nextInt();
		
		double result = amount%5==0 && amount > Acc_balance? (Acc_balance - amount)-0.5 : amount%5 != 0 ? Acc_balance : Double.parseDouble("Insufficient funds"); 
		
		System.out.println(result);
		 
	}
}
		