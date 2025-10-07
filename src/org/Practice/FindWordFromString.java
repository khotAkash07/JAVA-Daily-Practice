package org.Practice;

import java.util.Arrays;
import java.util.Scanner;

public class FindWordFromString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = "Akash Khot from shivpuri sangli";

        String target = "shivpuri2";
        String [] ch = str.split(" ");


        Arrays.stream(ch).map(str2 -> str2.equals(target)?"Present":"not present");
//        for(String str2: ch){
//            if(target.equals(str2)) {
//                System.out.println("Given Word is present :"+str2);
//                break;
//            }else{
//                System.out.println("Not present.");
//                break;
//            }
//        }
    }
}
