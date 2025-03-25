import java.util.Scanner;

public class FindSum{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value");
		int num = sc.nextInt();
		
		int arr[] = new int[]{2,7,11,15};
		
		for(int i = 0 ; i < arr.length - 1 ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if((arr[i]+arr[j]) == num){
					System.out.println(i+" "+j);
					break;
				}
			}
		}
	}
}