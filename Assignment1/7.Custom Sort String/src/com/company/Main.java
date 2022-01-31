package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public String customSortString(String S1, String S2) {

        int[] count = new int[26];
        for (char c : S2.toCharArray())
            count[c - 'a']++;
        
        StringBuilder answer = new StringBuilder();

        for (char c : S1.toCharArray()) {
            for (int i = 0; i < count[c - 'a']; ++i)
                answer.append(c);
            count[c - 'a'] = 0;
        }

        for (char c = 'a'; c <= 'z'; ++c)
            for (int i = 0; i < count[c - 'a']; ++i)
                answer.append(c);

        return answer.toString();
    }


}
