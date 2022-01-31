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


        int index = 0;
        Integer size = map.get(list.get(index));
        if(size > s.length() / 2 + s.length()  % 2 ) {
            return "";
        }

        String[] answer = new String[size];
        Arrays.fill(answer,"");

        for (char curChar : list) {
            for (int j = 0; j < map.get(curChar); j++) {
                answer[(index++) % size] += curChar;
            }
        }

        return String.join("",answer);
    }
}
