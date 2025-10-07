package org.String;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        String str = "akash khot shivpuri sangli";

        Set<Character> set = new HashSet<>();

        for(int i = 0; i<str.length();i++){
            set.add(str.charAt(i));
        }


        Character ch = null;
        for(Iterator<Character> i = set.iterator();i.hasNext();ch = i.next()){
            if(ch != null) System.out.println(ch);
        }
    }
}
