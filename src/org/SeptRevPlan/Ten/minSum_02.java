package org.SeptRevPlan.Ten;

public class minSum_02 {
    public static void main(String[] args) {
        int arr[] = {2, 1, 5, 1, 3, 2};

        int k = 3;
        int minSum = 0;
        int maxWindow = 0;

        for(int i = 0; i < k; i++){
            maxWindow += arr[i];
        }

        minSum = maxWindow;

        for(int end = k ; end < arr.length; end++){
            maxWindow += arr[end] - arr[end - k];
            minSum = Math.min(minSum, maxWindow);
        }

        System.out.println("The minimum sum of given window is = "+minSum);
    }
}
