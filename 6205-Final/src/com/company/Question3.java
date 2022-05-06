package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Question3 {

    public List<List<String>> groupAnagrams(String[] strs){

        if (strs == null || strs.length == 0) {
            return new ArrayList<>();
        }

        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            char[] ch = new char[26];

            for (char c : s.toCharArray()) {
                ch[c - 'a']++;
            }

            String key = String.valueOf(ch);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
