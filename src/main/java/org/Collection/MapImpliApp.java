package org.Collection;
import java.util.*;
public class MapImpliApp {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Akash");
        al.add("Abhishek");
        al.add("Shubham");
        al.add("Radhe");
        al.add("Sham");
        al.add("Shiv");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("Rohit");
        al2.add("Virat");
        al2.add("Hardik");
        al2.add("Iyyer");
        al2.add("Jadeja");
        al2.add("Shikhar");

        LinkedHashMap<String,Collection<String>> players = new LinkedHashMap<>();

        players.put("ShivpuriWarrirors",al);
        players.put("IndianWarriors",al2);

        Set<Map.Entry<String, Collection<String>>> set = players.entrySet();

        for(Map.Entry<String, Collection<String>> map : set) {
            System.out.println("Players from Team : " + map.getKey());
            Collection<String> value = map.getValue();
            for (String str : value) {
                System.out.println(str);
            }
        }
    }
}
