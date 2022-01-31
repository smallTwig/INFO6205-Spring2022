package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

    }

    public int[] frequencySort(int[] a) {
        List<int[]> list = new ArrayList<>();

        Map<Integer,Integer> map = new HashMap<>();
        for(int x: a){
            map.put(x, 1 + map.getOrDefault(x,0));
        }


        for(Map.Entry<Integer,Integer> ent: map.entrySet()){
            int key = ent.getKey();
            int value = ent.getValue();
            list.add(new int[]{key,value});
        }

        Collections.sort(list, new Comparator<int[]>(){
            public int compare(int[] a,int[] b){
                if (a[1] != b[1]){
                    return a[1] - b[1];
                } else {
                    return b[0] - a[0];
                }
            }
        });

        int[] b= new int[a.length];
        int idx = 0;
        for(int[] x: list){
            int key = x[0];
            int rep = x[1];
            for(int i = 0; i < rep; i++){
                b[idx++] = key;
            }
        }
        return b;

    }
}
