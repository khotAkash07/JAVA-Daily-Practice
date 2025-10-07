package org.SeptRevPlan.Ten;

import java.util.*;

public class DistElement_04 {
    public static void main(String[] args) {
        //Input: arr = [1, 2, 1, 3, 4, 2, 3], K=4
        //Output: [3, 4, 4, 3]
        int [] arr = {1, 2, 1, 3, 4, 2, 3};
        int k = 4;
        Set<Integer> set = null;
        for(int i = 0 ; k <= arr.length; i++, k++){
            set = new HashSet<Integer>();
            for(int j = i ; j < k ; j++){
                set.add(arr[j]);
            }

            System.out.print(set.size()+", ");

        }
    }
}
