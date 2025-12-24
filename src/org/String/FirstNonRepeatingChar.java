package org.String;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str = "abcdbhabcbghiabkabsh";

        char ch = 'a';

        // Last Non-Repeating Character
        for(int i = 0; i < str.length(); i++){
            int c = 0;
            for(int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    c++;
                }
            }
            if(c == 1){
                ch =  str.charAt(i);
            }
        }
        System.out.println("Last Non Repeating Char is = "+ch);

        // First Non-Repeating Character
        for(int i = 0; i < str.length(); i++){
            int c = 0;
            for(int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    c++;
                }
            }
            if(c == 1){
                System.out.println("first Non Repeating Char is = "+str.charAt(i));
                break;
            }
        }

        //Most Frequent Character

        int max = 0;
        for(int i = 0; i < str.length(); i++){
            int c = 0;
            for(int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    c++;
                }
            }
            if(c > max){
                ch = str.charAt(i);
                max = c;
            }
        }
        System.out.println("Most Frequent character is = " + ch);

        //Remove Duplicate

        //Using Collection
        Set<Character> set = new LinkedHashSet<>();
        for(int i = 0; i < str.length(); i++){
            set.add(str.charAt(i));
        }
        System.out.println(set);

        String uniqueChar = "";
        List<Character> list = List.of('b','c','d','e','f','c','d','e','f','a');
        uniqueChar = list.stream().distinct().map(String::valueOf).collect(Collectors.joining());
        //Find Unique Character from String
        System.out.println(uniqueChar);
        uniqueChar = "";

        for(int i = 0; i < str.length(); i++){
            int c = 0;
            for(int j = 0; j < str.length(); j++){
                if (str.charAt(i) == str.charAt(j)) {
                    c++;
                }
            }
            if( c == 1){
                uniqueChar += str.charAt(i);
            }
        }
        System.out.println("Unique char String is = "+uniqueChar);
    }
}
