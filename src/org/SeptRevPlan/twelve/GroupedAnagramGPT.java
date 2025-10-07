package org.SeptRevPlan.twelve;

import java.util.*;
public class GroupedAnagramGPT {
    public static List<List<String>> groupAnagrams(String[] strs) {
        // Create a HashMap where key is sorted string and value is list of anagrams
        Map<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // Convert string to char array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Add original string to the list for this sorted key
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(s);
        }

        // Return all grouped anagrams
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = groupAnagrams(input);

        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
