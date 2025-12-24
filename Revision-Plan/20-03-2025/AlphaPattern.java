/*****
A                 A 
A B             B A 
A B C         C B A
A B C D     D C B A 
A B C D E E D C B A
*****/

public class AlphaPattern{
	public static void main(String args[]){
		int n = 10;
		for(int i = 1 ; i <= 5 ; i++){	
		char ch = 'A';
			for(int j = 1 ; j <= 10 ; j++){
				if(j <= i){
					System.out.print(ch+" ");
					ch++;
				}else if(j >= n){
					ch--;
					System.out.print(ch+" ");
					
				}else{
					System.out.print("  ");
				}
				
			}
			n--;
			System.out.println();
		}
	}
}
			