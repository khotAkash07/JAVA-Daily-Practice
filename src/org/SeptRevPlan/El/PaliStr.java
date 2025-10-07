package org.SeptRevPlan.El;

public class PaliStr {
    public static void main(String[] args) {
        String str = "AkakA";
        String rev = "";

        for(int i = 0; i<str.length(); i++){
            rev = str.charAt(i) + rev;
        }

        if(str.equals(rev)){
            System.out.println("String is palindrome");
        }else System.out.println("Not Palindrome");
    }
}
