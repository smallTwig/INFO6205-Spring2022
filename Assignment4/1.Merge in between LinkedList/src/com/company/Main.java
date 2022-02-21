package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {

        ListNode list1last = list2;
        while (list1last.next != null) {
            list1last = list1last.next;
        }
        ListNode ap = list1;
        int i = 0;
        while (ap.next != null && i + 1 != a) {
            ap = ap.next;
            i++;
        }
        if (ap.next == null) {
            ap.next = list2;
            return list1;
        }
        i = 0;
        ListNode bp = list1;
        while (bp != null && i != b) {
            bp = bp.next;
            i++;
        }
        if (bp.next == null) {
            ap.next = list2;
            return list1;
        }
        ap.next = list2;
        list1last.next = bp.next;
        return list1;

    }
}
