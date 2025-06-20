/**************
A 
A B A
A B C B A
A B C D C B A
A B C D E D C B A
***********************/
public class AlphaPattern{
	public static void main(String args[]){
		
		for(int i = 1 ; i <= 5 ; i++){
			char ch = 'A';
			for(int j = 1 ; j < (i*2) ; j++){
				if(j <= i){
					System.out.print(ch+" ");
				}else{
					System.out.print(ch+" ");
				}
				
				if(j < i){
					ch++;
				}else{
					ch--;
				}
			}
			System.out.println();
		}
	}
}