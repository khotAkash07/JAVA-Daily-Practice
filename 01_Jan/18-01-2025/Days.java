import java.util.Scanner;
public class Days{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter number for Finding day :");
		int n = sc.nextInt();
		
		String result = n == 1 ? "Monday" : n == 2 ? "Tuesday" : n == 3 ? "Wednesday" : n == 4 ? "Thursday" : n == 5 ? "Friday" : n == 6 ? "Saturday" : n == 7 ? "Monday" : "Enter number between 1 to 7";
		System.out.println(result);
	}
}