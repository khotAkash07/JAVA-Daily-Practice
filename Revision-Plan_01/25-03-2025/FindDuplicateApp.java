import java.util.Scanner;
class Duplicate{
	int arr[];
	int count=0;
	public void setArr(int arr[]){
		this.arr = arr;
	}
	public void getDuplicates(){	//[1,2,3,4,5,6,1,2,3,4];
		int temp[] = new int[arr.length];
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if((arr[i] == arr[j])&&(count==0)){
					temp[count++] = arr[i];
					break;
				}else if((arr[i] == arr[j])&&(count>0)){
					for(int k = 0 ; k < temp.length ; k++){
						if(temp[k] == arr[i]){break;}else{
							temp[count++] = arr[i];
							break;
						}
					}
				}
			}
		}
		System.out.println("Duplicates=");
		for(int i = 0 ; i  < count ; i++){
			System.out.println(temp[i]);
		}
	}
}
public class FindDuplicateApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[10];
		
		System.out.println("Enter array elements");
		
		for(int i = 0 ; i  < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		Duplicate dp = new Duplicate();
		dp.setArr(arr);
		dp.getDuplicates();
	}
}