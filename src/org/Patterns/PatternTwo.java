package org.Patterns;

public class PatternTwo{
    public static void main(String args[]){

        int n = 5;
        for (int i = 1; i <= 2 * n - 1; i++) {
            int count = (i <= n) ? i : 2 * n - i;

            // spaces
            for (int s = n - count; s > 0; s--) {
                System.out.print("  ");
            }

            // numbers
            for (int num = 1; num <= count; num++) {
                System.out.print(num + "   ");
            }

            System.out.println();
        }
    }
}
