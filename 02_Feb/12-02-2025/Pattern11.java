public class Pattern11{
	public static void main(String args[]){
		int k = 1;
		for(int i = 1 ; i <= 13 ; i++){
			
			for(int j = 1 ; j <= 7 ; j++){
				
				if(j >= k){
					System.out.print("* ");
				}else{
					System.out.print("  ");
				}
			}
			if(i <= 6)
				k++;
			else
				k--;
			
			System.out.println();
		}
		
		byte l =1;
		for(byte i = 1 ; i <= 13 ; i++){
			byte a = 1;
			for(byte j = 1 ; j <= 7 ; j++){
				
				if(j >= l){
					System.out.print(" "+a);
					a++;
				}else{
					System.out.print("  ");
				}				
			}			
			if(i <= 6)
				l++;
			else
				l--;
			
			System.out.println();
		}
		
	}
}
				
				