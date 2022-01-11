package com.zzr;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.summarizingDouble;
import static java.util.stream.Collectors.toList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int[] a = {1,2,5};
        int[] b = {1,3,4};
        joinArray(a,b);

    }

    public static void joinArray(int[] arr1, int[] arr2){
        int len1 = arr1.length;
        int len2 = arr2.length;
        int[] arr = new int[len1+len2];

        if(arr1[len1-1]<arr2[0]){
            for(int i=0; i<len1; i++){
                arr[i] = arr1[i];
            }
            for(int j=0; j<len2; j++){
                arr[j+len1] = arr2[j];
            }
        }else if(arr2[len2-1]<arr1[0]){
            for(int i=0; i<len2; i++){
                arr[i] = arr2[i];
            }
            for(int j=0; j<len1; j++){
                arr[j+len2] = arr1[j];
            }
        }else{
            int p1 = 0;
            int p2 = 0;
            for(int i=0; i<len1+len2; i++){
                if(arr1[p1]<=arr2[p2]){
                    arr[i]=arr1[p1];
                    p1++;
                }else{
                    arr[i]=arr2[i];
                    p2++;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
