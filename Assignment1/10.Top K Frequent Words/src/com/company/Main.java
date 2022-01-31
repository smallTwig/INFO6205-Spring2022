package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Word> map = new HashMap<>();
        for(String w : words){
            if(!map.containsKey(w)){
                map.put(w, new Word(w));
            }else{
                map.get(w).freq++;
            }
        }

        List<String> res = new ArrayList<>(map.keySet());

        Collections.sort(res, (a, b) -> {
            if(map.get(a).freq == map.get(b).freq){
                return map.get(a).value.compareTo(map.get(b).value);
            }else{
                return map.get(b).freq - map.get(a).freq;
            }
        });

        return res.subList(0, k);
    }

    class Word {
        String value;
        int freq;
        Word(String val){
            this.value = val;
            this.freq = 1;
        }
    }
}
