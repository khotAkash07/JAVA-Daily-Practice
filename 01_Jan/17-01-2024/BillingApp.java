public class BillingApp{
	public static void main(String ar[]){
		
		int qty = 10;
		int rate = 100;
		
		double GST = (rate * qty)*18/100;
		
		double T_bill = (rate * qty)+GST;
		
		System.out.println(T_bill);
	}
}