package org.SeptRevPlan.Ten;

import java.util.ArrayList;

public class AvgOfWindow_03 {
    public static void main(String[] args) {
       // Input: arr = [1, 3, 2, 6, -1, 4, 1, 8, 2], K=5
       // Output: [2.2, 2.8, 2.4, 3.6, 2.8]

        int[] arr = {1, 3, 2, 6, -1, 4, 1, 8, 2};
        int k = 5;
        double avgValue = 0;
        double sum = 0;
        ArrayList<Double> arr2 = new ArrayList<>();

        for(int i = 0; i < k; i++){
            sum += arr[i];
        }

        avgValue = sum/k;
        System.out.println(avgValue);
        arr2.add(avgValue);

        for(int end = k; end < arr.length; end++){
            sum += arr[end] - arr[end - k];
            avgValue = sum/k;
            arr2.add(avgValue);
        }

        for(Double d:arr2){
            System.out.print(d+", ");
        }
    }
}
