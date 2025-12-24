import java.util.Scanner;

public class Tables{
	public static void main(String arg[]){
		
		for(int i = 1 ; i <= 10 ; i++){
			for(int j = 1 ; j <= 5 ; j++){
				if((j*i) <10){
					System.out.print(" 0"+j*i);
				}
				else{
					System.out.print(" "+j*i);
				}
					
			}
			System.out.println("\n");
		}
	}
}
			