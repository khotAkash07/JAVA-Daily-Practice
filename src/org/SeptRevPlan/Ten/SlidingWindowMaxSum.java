package org.SeptRevPlan.Ten;

public class SlidingWindowMaxSum {
    public static void main(String[] args) {
       // Input: arr = [2, 1, 5, 1, 3, 2], K=3
        // Output: 9 (subarray [5, 1, 3])

        int arr[] = {2, 1, 5, 1, 3, 2};

        int k = 3;
        int maxSum = 0;
        int maxWindow = 0;

        for(int i = 0; i < k; i++){
            maxWindow += arr[i];
        }

        maxSum = maxWindow;

        for(int end = k; end < arr.length; end++){

            maxWindow += arr[end] - arr[end - k];
            maxSum = Math.max(maxSum,maxWindow);
        }

        System.out.println("Max sum of given sub array of = "+maxSum);


    }
}
