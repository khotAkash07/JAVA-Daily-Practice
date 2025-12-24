import java.util.Scanner;

public class EnrollInCourse{
	public static void main(String ar[]){
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.print("Enter numbers : ");
		int xx = sc.nextInt();
		int yy  = sc.nextInt();
		int kk = sc.nextInt();
		
		String result =  xx <=(yy-kk) ? "Yes" : "No";
		
		System.out.println(result);
	}
}