import java.util.Scanner;

public class Salary{
	public static void main(String ar[]){
		
		Scanner sc = new Scanner(System.in);
		
		int salary = sc.nextInt();
		Double hra,da;
		
		
		if(salary <= 10000){
			System.out.println("HRA = "+(salary/100)*20 +"DA = "+(salary/100)*80);
		}else if(salary <= 20000 ){
			System.out.println("HRA = "+(salary/100)*25 +" And DA = "+(salary/100)*90 );
		}else{
			System.out.println("HRA = "+(salary/100)*30 +" And DA = "+(salary/100)*95 );
		}
	}
}