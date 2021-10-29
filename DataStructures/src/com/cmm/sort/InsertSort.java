package com.cmm.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author cang
 * @create 2021-10-29 16:05
 */
public class InsertSort {
    public static void main(String[] args) {
//        int[] arr = {5,4,2,3,1};
//        insertSort(arr);

        //测试选择排序速度
        int[] arr = new int[80000];
        for (int i = 0; i < 80000;i++){
            arr[i] = (int) (Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startTime = simpleDateFormat.format(date1);
        System.out.println("开始时间:" + startTime);

        insertSort(arr);

        Date date2 = new Date();
        String endTime = simpleDateFormat.format(date2);
        System.out.println("结束时间:" + endTime);

    }

    public static void insertSort(int[] arr){
        for (int i = 0;i < arr.length - 1;i++){
            int insertVal = arr[i+1];//要添加的元素
            int index = i;

            while (index >= 0 && insertVal < arr[index]){
                arr[index + 1] = arr[index];//先扩容，并复制大的元素到该位置
                index--;
            }
            //如果要添加的元素大于最后一个元素，则index+1便先扩容并添加新元素
            //反之，会进入while循环，最后index会再减1，那index+1就是新添加元素的的位置
            if (index != i) {
                arr[index + 1] = insertVal;
            }
//            System.out.println(Arrays.toString(arr));
        }
    }
}
