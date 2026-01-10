package org.Patterns;

public class NumberStarApp {
    public static void main(String[] args) {

        int n = 5;
        int count = 1;
        for(int i=1; i < n; i++){
            for(int j=1; j < i*2; j++){
                if(j%2==0)
                    System.out.print("*  ");
                else
                    System.out.print((count)+"  ");
            }
            System.out.println();
            count++;
        }
        for(int i=n; i > 0; i--){
            for(int j=1; j < i*2; j++){
                if(j%2==0)
                    System.out.print("*  ");
                else
                    System.out.print((count)+"  ");
            }
            System.out.println();
            count--;
        }
    }
}
