package com.cmm.sort;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * @author cang
 * @create 2021-10-29 15:08
 */
public class SelectSort {
    public static void main(String[] args) {
//        int[] arr1 = {5,4,3,2,1};
//        selectSort(arr1);
//        System.out.println(Arrays.toString(arr1));

        //测试选择排序速度
        int[] arr = new int[80000];
        for (int i = 0; i < 80000;i++){
            arr[i] = (int) (Math.random()*800000);
        }

        Date date1 = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String startTime = simpleDateFormat.format(date1);
        System.out.println("开始时间:" + startTime);

        selectSort(arr);

        Date date2 = new Date();
        String endTime = simpleDateFormat.format(date2);
        System.out.println("结束时间:" + endTime);

    }

    public static void selectSort(int[] arr){
        for (int i = 0;i < arr.length - 1; i++){
            int index = i;
            int min = arr[i];
            boolean flag = false;
            for (int j = i +1;j < arr.length ;j++){
                if (min < arr[j]){
                    min = arr[j];
                    index = j;
                    flag = true;
                }
            }
            if (index != i) {
                arr[index] = arr[i];
                arr[i] = min;
            }

            if (!flag)
                break;
//            System.out.println(Arrays.toString(arr));
        }
    }
}
