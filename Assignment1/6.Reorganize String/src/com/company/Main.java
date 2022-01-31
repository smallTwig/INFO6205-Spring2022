package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public String reorganizeString(String s) {
        Map<Character,Integer> map = new HashMap<>();

        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0) + 1);
        }
        List<Character> list = new ArrayList<>(map.keySet());
        list.sort((a,b) -> map.get(b) - map.get(a));


        int idx = 0;
        Integer size = map.get(list.get(idx));
        if(size > s.length() / 2 + s.length()  % 2 ) return "";       // prune

        String[] ans = new String[size];
        Arrays.fill(ans,"");

        for (char curChar : list) {
            for (int j = 0; j < map.get(curChar); j++) {
                ans[(idx++) % size] += curChar;
            }
        }
        return String.join("",ans);
    }
}
