package org.SeptRevPlan.El;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DuplicateChar {
    public static void main(String[] args) {
        String str = "programming";

        Set<Character> set = new HashSet<>();
        for(int i = 0; i < str.length(); i++){
            for(int j = i+1 ; j < str.length();j++){
                if(str.charAt(i) == str.charAt(j)){
                    set.add(str.charAt(i));
                    break;
                }
            }
        }

        System.out.println("Duplicate characters is = ");
        for(Character ch : set){
            System.out.print(ch+", ");
        }
    }
}
