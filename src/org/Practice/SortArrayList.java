package org.Practice;

import java.util.*;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> al = new ArrayList<>();
        al.add(1);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(70);
        al.add(60);
        al.add(50);
        al.add(101);
        al.add(101);
        al.add(2);

        for(int i=0; i<al.size()-1;i++){
            for(int j=i+1; j<al.size();j++){
                if(al.get(i) < al.get(j)){
                    int temp = al.get(i);
                    al.set(i,(al.get(j)));
                    al.set(j,temp);
                }
            }
        }
        System.out.println(al);

        int c = 0;
        for(int i=0; i<al.size(); i++){
            if(al.get(i) == al.get(i+1)){
                continue;
            }else{
                System.out.println(al.get(i));
                c++;
            }
            if (c == 3) break;
        }
    }
}
