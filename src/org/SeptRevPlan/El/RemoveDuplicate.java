package org.SeptRevPlan.El;


import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        String str = "banana";

//        Set<Character> set = new HashSet<>();
//        for(int i = 0; i < str.length(); i++){
//            set.add(str.charAt(i));
//        }
//        for (Character ch:set){
//            System.out.print(ch+", ");
//        }

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < str.length(); i++){
            char ch  = str.charAt(i);
            if(result.toString().indexOf(ch) == -1){
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}
