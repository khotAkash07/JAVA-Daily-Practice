package org.Collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FindUniqueChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any String : ");
        String str = sc.nextLine();

        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(str.charAt(i))){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        System.out.println("unique Characters is = ");
        for(Map.Entry<Character,Integer> map2 : map.entrySet()){
            if(map2.getValue() == 1)
                System.out.println(map2.getKey()+" "+map2.getValue());
        }
    }
}
