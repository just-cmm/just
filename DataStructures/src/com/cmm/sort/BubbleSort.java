package com.cmm.sort;

import java.lang.reflect.Array;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author cang
 * @create 2021-10-29 14:03
 */
public class BubbleSort {
    public static void main(String[] args) {
//        int[] arr = {3,9,-1,10,20};
        //测试冒泡排序速度
        int[] arr = new int[80000];
        for (int i = 0; i < 80000;i++){
            arr[i] = (int) (Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startTime = simpleDateFormat.format(date1);
        System.out.println("开始时间:" + startTime);

        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.bubbleSort(arr);

        Date date2 = new Date();
        String endTime = simpleDateFormat.format(date2);
        System.out.println("结束时间:" + endTime);
//        System.out.println(Arrays.toString(arr));

    }
    public void bubbleSort(int[] arr){
        int temp;
        for (int i = 0;i < arr.length - 1; i++){
            boolean flag = false;
            for (int j = 0;j <arr.length-i - 1;j++) {
                if (arr[j] > arr[j + 1]) {
                    flag = true;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
//            System.out.println("第" + (i+1) + "趟");
//            System.out.println(Arrays.toString(arr));
            if (!flag){
                break;
            }
        }
    }
}
