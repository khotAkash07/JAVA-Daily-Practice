package org.SeptRevPlan.El;

public class StringCompression {
    public static void main(String[] args) {

        String str = "aaabbc";

        for(int i = 0; i < str.length(); i++) {
            int count = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            i += count-1;
            System.out.print(str.charAt(i)+""+count);
        }
    }
}
