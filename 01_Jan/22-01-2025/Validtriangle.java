import java.util.*;

public class Validtringle{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter First angle :");
		int fa = sc.nextInt();
		System.out.print("\nEnter Second  Angle :");
		int sa = sc.nextInt();
		System.out.print("\nEnter Third angle :");
		int ta = sc.nextInt();
		
		int total = fa + sa + ta;
		if(total == 180){
			System.out.println("Yes...! it`s triangle");
		}		
		else{
			System.out.println("No...! it`s not a triangle");
		}
	}
}