public class Pattern01{
	public static void main(String args[]){
		
		for(int i = 1 ; i <= 7 ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print(" "+j);
			}
			System.out.print("\n");
		}
		for(int i = 1 ; i <= 7 ; i++){
			for(int j = 1 ; j <= i ; j++){
				System.out.print("* ");
			}
			System.out.print("\n");
		}
		for(int i = 1 ; i <= 7 ; i++){
			char ch = 'A';
			for(int j = 1 ; j <= i ; j++){
				System.out.print(" "+ch);
				ch++;
			}
			System.out.print("\n");
		}
	}
}