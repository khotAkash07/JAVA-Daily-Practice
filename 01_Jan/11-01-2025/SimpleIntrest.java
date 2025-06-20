public class SimpleIntrest{
	public static void main(String arg[]){
	
		int baseValue = Integer.parseInt(arg[0]);
		int intrest = Integer.parseInt(arg[1]);
		int year = Integer.parseInt(arg[2]);
		
		double t_intrest = (baseValue/100)*intrest;
		
		double total = baseValue + t_intrest;
		
		double simple_intrest = t_intrest*year;
		
		System.out.println("simple interest of "+baseValue+" for "+ year+ " years = "+simple_intrest); 
		
	}
}