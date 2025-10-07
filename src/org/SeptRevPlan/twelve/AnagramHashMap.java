package org.SeptRevPlan.twelve;

import java.util.*;
public class AnagramHashMap {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String one = sc.nextLine();
        String two = sc.nextLine();

        HashMap<Character, Integer> map01 = new LinkedHashMap<>();
        HashMap<Character, Integer> map02 = new LinkedHashMap<>();

        if(one.length() != two.length()){
            System.out.println("Given Strings are not angram ");
        }else{
            for(int i=0; i<one.length(); i++){
                char ch = one.charAt(i);
                if(map01.containsKey(ch)){
                    map01.put(ch,map01.get(ch)+1);
                }else {
                    map01.put(ch,1);
                }
            }
            for(int i=0; i<two.length(); i++){
                char ch = two.charAt(i);
                if(map02.containsKey(ch)){
                    map02.put(ch,map02.get(ch)+1);
                }else {
                    map02.put(ch,1);
                }
            }
            if(map01.equals(map02)){
                System.out.println("Given strings are anagram");
            }else{
                System.out.println("Not Anagram");
            }
        }

    }
}
