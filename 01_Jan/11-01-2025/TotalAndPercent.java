public class TotalAndPercent{
	public static void main(String arg[]){
		
		int java = Integer.parseInt(arg[0]);
		int python = Integer.parseInt(arg[1]);
		int c = Integer.parseInt(arg[2]);
		int cpp = Integer.parseInt(arg[3]);
		int DSA = Integer.parseInt(arg[4]);
		
		int Total = java + python + c + cpp + DSA;
		
		double per = Total/5;
		
		System.out.println("Total marks of 5 subject is = "+ Total+" \n Percentage of 5 subject is = "+ per);
	}
}
		