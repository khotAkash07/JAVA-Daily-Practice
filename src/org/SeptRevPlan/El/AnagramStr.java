package org.SeptRevPlan.El;

import java.util.Scanner;

public class AnagramStr {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First string");
        String str = sc.nextLine();

        System.out.println("Enter second string");
        String str2 = sc.nextLine();

        if(str.length() != str2.length()){
            System.out.println("Given Strings are not anagram");
        }else{
            boolean flag = false;
            for(int i =0; i<str.length();i++){
                flag = false;
                for(int j=0; j<str2.length(); j++){
                    if(str.charAt(i) == str2.charAt(j)){
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(!flag){
                System.out.println("Given strings are not anagram");
            }else {
                System.out.println("Given Strings are anagram");
            }

        }
    }
}
