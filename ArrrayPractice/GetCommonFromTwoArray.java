public class GetCommonFromTwoArray{
	public static void main(String args[]){
		
		int a[] = {1,2,3,2,3,1};
		int b[] = {2,2,1,3,3};
		
		int count = 0;
		
		int gc[] = new int[a.length];
		int re = gc.length;
		
		for(int i = 0 ; i < a.length ; i++){
			boolean flag = false;
			for(int j = 0 ; j < b.length ; j++){
				if((count==0)&&(a[i] == b[j])){
					gc[count] = a[i];
					count++;
					break;
				}else if((count>0)&&(a[i] == b[j])){
					for(int k = 0 ; k < count ; k++){
						if(gc[k] == a[i]){
							flag = true;
							break;
						}
					}
					if(!flag){
						gc[count++] = a[i];
						break;
					}
				}					
			}
		}
		
		System.out.println("Comman elements are");
		for(int i = 0 ; i < count ; i++){
			System.out.println(gc[i]);
		}
	}
}