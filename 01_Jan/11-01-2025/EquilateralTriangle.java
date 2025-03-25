import java.util.*;

public class EquilateralTriangle{
	public static void main(String arg[]){
		
		int a = Integer.parseInt(arg[0]);
		double b = Math.sqrt(3);
		
		
		double area = (b/4)*a*a;
		
		
		
		System.out.println("The area of equilateral triangle = "+area);
		
	}
}