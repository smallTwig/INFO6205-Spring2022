package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int i) {

        Map<String, Word> map = new HashMap<>();
        for(String w : words){
            if(!map.containsKey(w)){
                map.put(w, new Word(w));
            }else{
                map.get(w).frequent++;
            }
        }

        List<String> res = new ArrayList<>(map.keySet());

        Collections.sort(res, (a, b) -> {
            if(map.get(a).frequent == map.get(b).frequent){
                return map.get(a).value.compareTo(map.get(b).value);
            }else{
                return map.get(b).frequent - map.get(a).frequent;
            }
        });

        return res.subList(0, i);
    }

    class Word {
        String value;
        int frequent;

        Word(String value){
            this.value = value;
            this.frequent = 1;
        }
    }
}
