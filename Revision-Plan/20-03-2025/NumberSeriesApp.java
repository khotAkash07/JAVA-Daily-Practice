//2  729  4  512  6  343  8  216  10  125  12  64  14  27  16  8  18  1 

public class NumberSeriesApp{
	public static void main(String args[]){
		int a = 1;
		int b = 9;
		for(int i = 0 ; i < 18 ; i++){
			if(i % 2 == 0){
				System.out.print(a*2+"  ");
				a++;
			}else{
				System.out.print((b*b*b)+"  ");
				b--;
			}
		}
	}
}