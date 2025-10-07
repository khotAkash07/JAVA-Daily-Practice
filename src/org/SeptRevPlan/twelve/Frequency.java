package org.SeptRevPlan.twelve;

import java.io.CharArrayReader;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class Frequency {
    public static void main(String[] args) {
        String str = "Programming";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Character ch : map.keySet()){
            System.out.println(ch +" : Present in String for "+map.get(ch)+" Times.");
        }
    }
}
