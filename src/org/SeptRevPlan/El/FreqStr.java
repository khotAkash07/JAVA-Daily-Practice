package org.SeptRevPlan.El;

import javax.print.attribute.HashAttributeSet;
import java.util.HashMap;
import java.util.Map;

public class FreqStr {
    public static void main(String[] args) {
        String str = "hello";

       Map<Character, Integer> count = new HashMap<>();

       for(int i=0; i<str.length(); i++){
           char ch = str.charAt(i);

           if(count.containsKey(ch)){
               count.put(ch,count.get(ch)+1);
           }else {
               count.put(ch,1);
           }
       }

       for(Character ch : count.keySet()){
           System.out.println(ch +" : "+count.get(ch));
       }
    }
}
