package org.SeptRevPlan.twelve;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class First {

    public static void main(String[] args) {

        String str = "abcdeabc";

        HashMap<Character, Integer> hmap = new LinkedHashMap<>();

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(hmap.containsKey(ch)){
                hmap.put(ch, hmap.get(ch)+1);
            }else {
                hmap.put(ch,1);
            }
        }

        for (Character ch : hmap.keySet()){
            if(hmap.get(ch) == 1) {
                System.out.println(ch + " => present " + hmap.get(ch) + " Times.");
                System.out.println("And This is the first non repeating character...");
                break;
            }
        }

    }
}
