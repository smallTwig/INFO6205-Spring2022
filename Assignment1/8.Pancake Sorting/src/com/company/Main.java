package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

    }
    public List<Integer> pancakeSort(int[] arr) {

        int max = 0;List<Integer> list = new ArrayList();int count = 0;

        for(int i=arr.length;i>1;i--){
            max = 0;count =0;
            for(int j=0;j<i;j++){
                if(arr[j] > arr[max]){
                    count++;
                    max = j;
                }
            }

            if(count+1 == i)return list;
            if(max == i+1)continue;
            arr = swap(arr,max+1);

            list.add(max+1);
            arr = swap(arr,i);

            list.add(i);

        }
        return list;
    }

    public int[] swap(int[] arr, int loc){

        int i=0,j=loc-1;

        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;j--;
        }
        return arr;
    }
}
