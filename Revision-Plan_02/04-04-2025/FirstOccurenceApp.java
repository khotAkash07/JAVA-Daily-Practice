import java.util.Scanner;

class FirstOccurence {
	
	int arr[];
	public void setArray(int arr[]){
		this.arr = arr;
	}
	public int findFirstOccurenceIndex(int sKey){
		int l = 0;
		int m = arr.length-1;
		int mid = 0;
		while(l < m){
			mid = l+(m-l)/2;
			
			if(arr[mid] == sKey){
				while(true){
					if(mid == 0){
						return mid;
					}else if(arr[mid] == arr[mid-1]){
						mid = mid-1;
					}else{
						return mid;
					}					
				}
			}else if(arr[mid] < sKey){
				l = mid+1;
			}else{
				m = mid - 1;
			}
		}
		return -1;
	}
}
public class FirstOccurenceApp{
	public static void main(String args[]){
		
		int arr[] = {8,4,4,5,3,2};
		
		FirstOccurence bs = new FirstOccurence();
		
		int sKey = 4;
		bs.setArray(arr);
		System.out.println("first key found at index "+bs.findFirstOccurenceIndex(sKey));
	}
}