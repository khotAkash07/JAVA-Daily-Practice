import java.util.*;

public class ProfitLoss{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter cost price :");
		int cp = sc.nextInt();

		System.out.print("\nEnter selling price :");
		int sp = sc.nextInt();
		
		if(cp > sp){
			System.out.println("You make Loss");
		}
		else if(cp == sp){
			System.out.println("You are nutral");
		}
		else{
			System.out.println("You make Profit");
		}
	}
}