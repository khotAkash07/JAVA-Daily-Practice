/*************************************************************************
Q4. Search for a pair with a given sum in an array.
Given an array arr[] of n integers and a target value, the task is to find whether there 
is a pair of elements in the array whose sum is equal to target. This problem is a variation 
of 2Sum problem.
Examples: 
Input: arr[] = [0, -1, 2, -3, 1], target = -2
Output: true
Explanation: There is a pair (1, -3) with the sum equal to given target, 1 + (-3) = -2.
Input: arr[] = [1, -2, 1, 0, 5], target = 0
Output: false
Explanation: There is no pair with sum equals to given target.
*********************************************************************/

import java.util.Scanner;

class Pair{
	int myArr[];
	int target;
	void setValues(int a[], int b){
		myArr = a;
		target = b;
	}
	boolean CheckPairSum(){
		
		for(int i = 0 ; i < myArr.length - 1 ; i++){
			for(int j = i + 1 ; j < myArr.length ; j++){
				if(myArr[i] + myArr[j] == target){
					return true;
				}
			}
		}
		return false;
	}
}
public class PairElementsApp{
	public static void main(String arg[]){
		
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		System.out.println("Enter array elements : ");
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter target number :");
		int target = sc.nextInt();
		
		Pair pr = new Pair();
		pr.setValues(arr, target);
		System.out.println(pr.CheckPairSum());
	}
}
		