package org.Patterns;

public class AlphaPattern {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++){
            int ch = 1;
            for(int k = 5 ; k > i; k--){
                System.out.print("  ");
            }
            for(int j=1; j<i*2; j++){
                if(j < i) {
                    System.out.print((ch++)+" ");
                }else{
                    System.out.print((ch--)+" ");
                }
            }
            System.out.println();
        }
    }
}
