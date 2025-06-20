/*****
01 02 03 04 05
10 09 08 07 06
11 12 13 14 15
20 19 18 17 16
*****/
import java.util.Scanner;

public class NumberPattern{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		int a = 1;
		int b = 10;
		for(int i = 0 ; i <= 5 ; i++){
			for(int j = 0 ; j < 5 ; j++){
				if(a < 10 ||(i == 1 && j > 0)){
					if(i % 2 == 0){
						System.out.print("0"+(a+j)+"\t");
					}else{
						System.out.print("0"+(b-j)+"\t");
					}
				}else{
					if(i % 2 == 0){
						System.out.print(a+j+"\t");
					}else{
						System.out.print(b-j+"\t");
					}
				}
			}
			if(i % 2 == 0){
					a += 10;
				}else{
					b += 10;
				}			
			System.out.println();
		}
	}
}