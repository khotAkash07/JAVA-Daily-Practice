/********
          1
	    1 2 =  8  - 2  	- 6
      1 2 3 =  9  - 4 	- 5
    1 2 3 4 = 10  - 6	- 4
  1 2 3 4 5 = 11  - 8	- 3
2   
*******/
public class Pattern02{
	public static void main(String args[]){
		
		for(int i = 1; i<=13; i++){		
			int k = 1;		
			for(int j = 1; j <= 7; j++){
				if(i <= 7){
					if(j >= i){
						System.out.print(" "+k);
						k++;
					}else{
						System.out.print("  ");
					}
				}else{
					if(j <= 13-i){
						System.out.print("  ");
					}else{
						System.out.print(" "+k);
						k++;
					}
				}
			}
			System.out.println();			
		}
	}
}