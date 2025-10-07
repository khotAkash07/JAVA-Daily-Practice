package org.Patterns;

public class NumberPattern01 {
    public static void main(String[] args) {
        int a=0;
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++) {
                if(a < 10) {
                    if (i % 2 != 0) System.out.print("0"+(++a) + " ");
                    else System.out.print("0"+(a--) + " ");
                }else{
                    if (i % 2 != 0) System.out.print((++a) + " ");
                    else System.out.print((a--) + " ");
                }
            }
            a += 5;
            System.out.println();
        }
    }
}
