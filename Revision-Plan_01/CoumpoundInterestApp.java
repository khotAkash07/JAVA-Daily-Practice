import java.util.Scanner;

public class CoumpoundInterestApp{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle amount");
		int pa = sc.nextInt();
		int copy = pa;
		System.out.println("Enter time yearWise");
		double t = sc.nextDouble();
		System.out.println("Enter Rate of percentage");
		double r = sc.nextDouble();
		double interest = 0;
		for(int i = 0 ; i < t ; i++){			
			interest = (pa*1*r)/100.0;
			System.out.println("Interest for "+ (i+1) +" Year = "+interest);
			pa += interest;
		}
		double ci = pa-copy;
		System.out.println("Final Amount = "+pa);
		System.out.println("Coumpound Interest Amount = "+ci);
	}
}