public class Pattern08{
	public static void main(String args[]){
		
		for(int i = 7 ; i >= 1 ; i--){
			for(int j = 1 ; j <= 7 ; j++){
				
				if( j >= 8-i){
					System.out.print("* ");
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
				
	}
}