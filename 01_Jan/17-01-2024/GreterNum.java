public class GreaterNum{
	public static void main(String ar[]){
		
		int a = 10;
		int b = 5;
		int c = 8;
		
		String result = a > b && a > c ? "A is Greter" : b > c ? "B is greter" : "C is Greter";
		
		System.out.println(result);
	}
}