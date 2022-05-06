package com.company;

public class Question1 {

    public String compressString(String str){

        if (str == null || str.length() == 0) {
            return str;
        }

        int i = 0;
        int j = 0;
        StringBuilder sb = new StringBuilder();

        while (j < str.length()) {
            if (str.charAt(j) != str.charAt(i)) {
                sb.append(str.charAt(i));
                sb.append(j - i);
                i = j;
            }
            j++;
        }
        sb.append(str.charAt(i));
        sb.append(j - i);

        if (sb.length() >= str.length()) {
            return str;
        }

        return sb.toString();
    }
}
