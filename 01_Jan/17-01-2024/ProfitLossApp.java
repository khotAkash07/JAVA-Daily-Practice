public class ProfitLossApp{
	public static void main(String ar[]){
		
		int sp = 10;
		int cp = 100;
		
		String result = cp == sp ? "No profit No Loss" : cp > sp ? "Loss" : "Profit";
		System.out.println(result);
	}
}