package org.SeptRevPlan.eight;

public class First {
    public static void main(String[] args) {
        int [] arr = {10, 20, 30, 40, 50};

        int max = Integer.MIN_VALUE;

        for(int i = 0 ; i < arr.length ; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max Element is = "+max);

        // ------------------------------Find Minimum number---------------------------------------

        int min = Integer.MAX_VALUE;
        for(int i = 0 ; i < arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Min Element is = "+min);

        // ------------------------------Find Sum From Array ---------------------------------------

        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
           sum += arr[i];
        }
        System.out.println("Sum of all Element is = "+sum);

        // ------------------------------Find Avg From Array ---------------------------------------

        int avg = sum/arr.length;

        System.out.println("Avg of all element is = "+avg);

        //------------------------------Search number From Array ---------------------------------------
/*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any value for search :");
        int target = sc.nextInt();
        boolean flag = false;
        for(int i = 0 ; i < arr.length ; i++){
            if(target == arr[i]){
                flag = true;
            }
        }
            System.out.println(flag?"value found":"value not found");
*/

        // ------------------------------Find Frequency From Array ---------------------------------------

        int freAry[] = {4, 5, 6, 4, 5, 7, 4};

        for(int i = 0 ; i < freAry.length ; i++){
            for(int j = i+1 ; j < freAry.length ; j++) {
                if (freAry[i] > freAry[j]) {
                    int temp = freAry[i];
                    freAry[i] = freAry[j];
                    freAry[j] = temp;
                }
            }
        }



        for(int i = 0 ; i < freAry.length ; i++){
            int c = 0;
            for(int j = i+1 ; j < freAry.length ; j++){
                if(freAry[i] == freAry[j]) c++;
            }
            System.out.println(freAry[i]+" Present int array for "+(c+1)+" times.");
            i += c;
        }

        // ------------------------------Reverse an Array ---------------------------------------

        int l = 0;
        int r = arr.length-1;

        while(l < r){

            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        for(Integer a : arr){
            System.out.print(a+" ");
        }

        // ------------------------------Copy Array ---------------------------------------

        int[] arr2 = arr.clone();
        System.out.println("\n------------------------------------------");
        for(Integer a : arr2){
            System.out.print(a+" ");
        }
        arr[3] = 90;

        System.out.println("\n------------------------------------------");
        for(Integer a : arr){
            System.out.print(a+" ");
        }
        System.out.println("\n------------------------------------------");
        for(Integer a : arr2){
            System.out.print(a+" ");
        }

        // ------------------------------Sort by ascending Array ---------------------------------------

        int freAry2[] = {8,8,8,8,8,8,8,9,7};

        for(int i = 0 ; i < freAry2.length ; i++){
            for(int j = i+1 ; j < freAry2.length ; j++) {
                if (freAry2[i] > freAry2[j]) {
                    int temp = freAry2[i];
                    freAry2[i] = freAry2[j];
                    freAry2[j] = temp;
                }
            }
        }
        System.out.println("\n------------------------------------------");
        for(Integer i : freAry2){
            System.out.print(i+" ");
        }

        // ------------------------------Sort by descending Array ---------------------------------------

        for(int i = 0 ; i < freAry2.length ; i++){
            for(int j = i+1 ; j < freAry2.length ; j++) {
                if (freAry2[i] < freAry2[j]) {
                    int temp = freAry2[i];
                    freAry2[i] = freAry2[j];
                    freAry2[j] = temp;
                }
            }
        }
        System.out.println("\n------------------------------------------");
        for(Integer i : freAry2){
            System.out.print(i+" ");
        }

        // ------------------------------Sec large from Array ---------------------------------------
        boolean flag = false;
        for (int i = 0 ; i < freAry2.length-1; i++){
            if(freAry2[i] == freAry2[i+1]){
                continue;
            }else{
                System.out.println("\nSec large element is = "+freAry2[i+1]);
                flag = true;
                break;
            }
        }


    }
}

