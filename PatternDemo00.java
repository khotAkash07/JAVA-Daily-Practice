public class PatternDemo00{
	public static void main(String args[]){
		
		int c = 0;
		
		for(int i = 0; i<4; i++){
			for(int j=0; j<5; j++){
				System.out.print((i%2==0) ? (++c)+" ":(c--)+" ");
			}
			c += 5;
			System.out.println();
		}
	}
}