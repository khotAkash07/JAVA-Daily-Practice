class BinarySearch{
	int arr[];
	
	public void setArr(int arr[]){
		this.arr = arr;
	}
	
	public int getIndex(int sKey){
		
		int l = 0;
		int m = arr.length-1;
		int mid = 0;
		while(l < m){
			mid = l+(m-l)/2;
			if(arr[mid] == sKey){
				return mid;
			}else if(arr[mid] < sKey){
				l = mid+1;
			}else{
				m = mid - 1;
			}
		}
		return -1;
	}
}
public class BinarySearchApp{
	public static void main(String args[]){
		
		int arr[] = {10,20,30,40,50,60,70,80,90};
		
		BinarySearch bs = new BinarySearch();
		
		int sKey = 50;
		bs.setArr(arr);
		System.out.println("Given key found at index "+bs.getIndex(sKey));
	}
}