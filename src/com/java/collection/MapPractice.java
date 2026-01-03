package com.java.collection;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {

        int [] arr = {1,2,3,4,4,2,3,4,3,2,2,2,1,3,1,2,3,1,2,3,1,2,3,2,1,3};

        Map<Integer,Integer> map = new HashMap<Integer,Integer>();

        for (int val : arr) {
            map.put(val, map.containsKey(val) ? map.get(val) + 1 : 1);
        }

        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            int key =  m.getKey();
            System.out.println("Number "+key+" Occurred for "+ map.get(key) +" Times.");
        }
    }
}
