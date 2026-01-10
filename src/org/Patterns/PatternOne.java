package org.Patterns;
import java.util.Scanner;

public class PatternOne{
    public static void main(String [] str){

       int n = 10;
        int count = 1;
        for(int i=1; i<n; i++){
            for(int j =1 ;j < n; j++){
                if((j == (i+4)) || (j == (6-i)) || (j == (i-4)) || (i + j == 14))
                    System.out.print(count+"  ");
                else
                    System.out.print("   ");
            }
            if(i < n/2) count++;
            else count--;
            System.out.println();
        }

    }
}