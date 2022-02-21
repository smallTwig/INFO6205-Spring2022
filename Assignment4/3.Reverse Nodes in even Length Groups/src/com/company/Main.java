package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
    public ListNode reverseEvenLengthGroups(ListNode head) {

        if(head==null)
            return head;

        List<List<Integer>> list = new ArrayList<>();
        int start=0;

        while(head!=null){
            List<Integer> arr = new ArrayList<>();
            for(int i=0;i<=start;i++){
                if(head==null)
                    break;
                arr.add(head.val);
                head=head.next;
            }
            list.add(arr);
            start++;
        }

        ListNode temp = null;

        for(List<Integer> arr : list){
            if(arr.size()%2==0){
                for(int i=arr.size()-1;i>=0;i--){

                    ListNode newNode = new ListNode(arr.get(i));

                    if(head==null){
                        head=temp=newNode;
                    }else{
                        temp.next=newNode;
                        temp=newNode;
                    }
                }
            }else{
                for(int i=0;i<arr.size();i++){

                    ListNode newNode = new ListNode(arr.get(i));

                    if(head == null ){
                        head=temp=newNode;
                    }else{
                        temp.next=newNode;
                        temp=newNode;
                    }
                }
            }
        }
        return head;
    }
}
