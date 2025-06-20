/********	
1
2 # 2
3 # 3 # 3
4 # 4 # 4 # 4
5 # 5 # 5 # 5 # 5
5 # 5 # 5 # 5 # 5
4 # 4 # 4 # 4
3 # 3 # 3
2 # 2
1
*********/

public class StarPattern{
	public static void main(String args[]){
		int count = 0;
		int num = 0;
		for(int i = 0 ; i < 10 ; i++){
			if(i < 5){
				count++;
				num++;
			}else if(i > 5){
				count--;
				num--;
			}
			for(int j = 1 ; j < (count*2) ; j++){
				if(j % 2 != 0){
					System.out.print((num)+" ");
				}else{
					System.out.print("# ");
				}				
			}
			
			System.out.println();
		}
	}
}
					