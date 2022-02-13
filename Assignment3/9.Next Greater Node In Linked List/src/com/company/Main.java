package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

    }

    public int[] nextLargerNodes(ListNode head) {

        ArrayList<Integer> list = new ArrayList<>();

        while (head != null) {
            list.add(head.val);
            head = head.next;
        }

        int[] arr = new int[list.size()];
        Stack<Integer> st = new Stack<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            if (st.size() == 0) {
                arr[i] = 0;
                st.push(list.get(i));
            } else if (st.size() != 0 && st.peek() > list.get(i)) {
                arr[i] = st.peek();
                st.push(list.get(i));
            } else if (st.size() != 0 && st.peek() <= list.get(i)) {
                while (st.size() != 0 && st.peek() <= list.get(i)) {
                    st.pop();
                }
                if (st.size() == 0) {
                    arr[i] = 0;
                } else {
                    arr[i] = st.peek();
                }
                st.push(list.get(i));
            }

        }
        return arr;
    }
}
