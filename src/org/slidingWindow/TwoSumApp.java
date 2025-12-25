package org.slidingWindow;

public class TwoSumApp {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,6,8,9};
        int target = 11;
        boolean flag = false;
        int c = 0;

            for(int i = 0; i <arr.length-2; i++){
                if(i != 0) c -= arr[i-1];

                for(int j = i; j < i+2; j++){
                    if(c != target){
                        if(c != arr[j]) c += arr[j];
                    }else{
                        break;
                    }
                }

                System.out.println(c);
                if(c == target){
                    System.out.println(arr[i]+" "+arr[i+1]);
                    break;
                }
            }

    }
}
