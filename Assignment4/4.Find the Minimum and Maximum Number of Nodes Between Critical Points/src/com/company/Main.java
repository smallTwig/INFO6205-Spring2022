package com.company;

public class Main {

    public static void main(String[] args) {

    }

    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int firstIndex = -1, prevIndex = -1, i = 0;
        int[] res = new int[]{-1,-1};

        while(head!=null && head.next!=null && head.next.next!=null){

            int val = head.val, nval = head.next.val, nnval = head.next.next.val;

            if(nval<val && nval<nnval || nval>val && nval>nnval){
                if(firstIndex<0){
                    prevIndex = firstIndex = i;
                }else{
                    res[0] = res[0]==-1 ? i-prevIndex : Math.min(res[0], i-prevIndex);
                    res[1] = Math.max(res[1], i-firstIndex);
                    prevIndex = i;
                }
            }
            i++;
            head=head.next;
        }
        return res;
    }
}
