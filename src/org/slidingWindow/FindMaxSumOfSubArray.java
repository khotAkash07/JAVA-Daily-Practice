public class FindMaxSumOfSubArray{
	public static void main(String arg[]){
		int arr[] = new int[]{100,200,30,40,50,60,70,80};
		int max2=0,k = 3;
		
		int windowSum = 0;
		for(int i=0; i<k; i++)	windowSum += arr[i];
		int maxSum = windowSum;
		
		System.out.println(windowSum);
		for(int i=k; i<arr.length; i++){
			windowSum += arr[i]-arr[i-k];
			maxSum = Math.max(windowSum, maxSum);
		}
		System.out.println("Max sum of subArray of size "+ k +" is = "+maxSum);
		
		/*
		for(int i=0; i<arr.length-k; i++){
			int lim = k;
			int count = i, max1 = 0;
			while(lim > 0){
				max1 += arr[count++];
				lim--;
			}
			if(max1 > max2){
				max2 = max1;
			}
		}
		System.out.println("Max sum of subArray of size "+ k +"is = "+max2);
		*/
		
		
	}
}