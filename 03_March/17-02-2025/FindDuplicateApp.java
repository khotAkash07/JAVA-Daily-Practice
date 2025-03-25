public class FindDuplicateApp{
	public static void main(String args[]){
		
		int num[] = {1,2,3,1,2,3,1,2,3,4,5,1,2,4,2,1};
		
		for(int i = 0 ; i < num.length ; i++){
			for(int j = i+1 ; j < num.length ; j++){
				if(num[i] > num[j]){
					int temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		for(int i = 0 ; i < num.length ; i++){
			int count = 0;
			for(int j = i+1 ; j < num.length ; j++){
				if(num[i] == num[j]){
					if(j == (i+1)){
						System.out.print(num[j]+"\t");
					}
					System.out.print(num[j]+"\t");
					count++;
				}
			}
			System.out.println();
			i +=count;
		}
	}
}