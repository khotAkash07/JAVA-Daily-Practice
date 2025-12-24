public class Pattern01{
	public static void main(String args[]){
			int k = 1;
		for(int i = 1; i<=13; i++){		
			for(int j = 1; j <= k; j++){
				System.out.print(" *");
			}
			if(i <= 6){
				k++;
			}else{
				k--;
			}
			System.out.println();
		}
	}
}