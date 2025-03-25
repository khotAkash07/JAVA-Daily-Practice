public class compoundIntrest{
	public static void main(String ar[]){
		
		int basevalue = Integer.parseInt(ar[0]);
		int intrest = Integer.parseInt(ar[1]);
		int years = Integer.parseInt(ar[2]);
		
		double intrest2 = 0;
		for(int i = 1 ; i <= years ; i++){
			
			intrest2 += (basevalue/100)*intrest;
			basevalue += intrest2;
		}
		System.out.println(intrest2);
		
	}
}