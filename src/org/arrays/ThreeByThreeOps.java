package org.arrays;

import java.util.Scanner;

public class ThreeByThreeOps {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] result = new int[3][3];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i < b.length; i++) {
            for(int j=0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i < a.length; i++) {
            for(int j=0; j < a[i].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
            System.out.println();
        }

        for(int i=0; i < a.length; i++) {
            for(int j=0; j < a[i].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
