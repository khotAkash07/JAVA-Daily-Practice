public class GreaterNum{
	public static void main(String ar[]){
		
		int a = 101;
		int b = 50;
		int c = 80;
		
		String result = a > b && a > c ? "A is Greter" : b > c ? "B is greter" : "C is Greter";
		
		System.out.println(result);
		
		// EVEN ODD
		 String result2 = a % 2 == 0 ? "A is Even" : "A is Odd";
		 System.out.println(result2);
		 
	}
}