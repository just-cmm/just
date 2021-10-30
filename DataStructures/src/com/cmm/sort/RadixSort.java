package com.cmm.sort;

import java.util.Arrays;

/**
 * @author cang
 * @create 2021-10-30 16:40
 */
public class RadixSort {
    public static void main(String[] args) {

        int[] arr = {53,3,542,748,14,214};
        radixSort(arr);

    }

    public static void radixSort(int[] arr){

        int max = arr[0];
        for (int i = 1; i< arr.length; i++){
            if (arr[i] > max)
                max = arr[i];
        }

        //最大数的位数
        int maxLength = (max + "").length();

        for (int i = 0; i < maxLength; i++) {
            //定义一个二维数组，表示10个桶
            //基数排序用空间换时间
            int[][] bucket = new int[10][arr.length];

            int[] bucketElementCounts = new int[10];

            for (int j = 0; j < arr.length; j++) {
//            int digitOfElement = arr[j] % 10;
                int digitOfElement = (int) (arr[j] / Math.pow(10,i)  % 10);
                bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
                bucketElementCounts[digitOfElement]++;
            }

            int index = 0;
            for (int k = 0; k < bucket.length; k++) {
                if (bucketElementCounts[k] != 0) {
                    for (int l = 0; l < bucketElementCounts[k]; l++) {
                        arr[index++] = bucket[k][l];
                    }
                }
                bucketElementCounts[k] = 0;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
