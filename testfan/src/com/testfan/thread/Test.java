package com.testfan.thread;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Administrator on 2017/11/24.
 */
public class Test {
    public static void main(String[] args) {
        String t = "";
        int[] arr = { 6, 3, 8, 2, 9, 1 };
        System.out.println(" 排序前");
        for (int i : arr) {
            System.out.print(i);
        }
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }

            }

        }
        //362819
        System.out.println("排序后=====");
        for (int num : arr) {
            System.out.print(num);
        }
    }
//        int[] arr = {6, 3, 8, 2, 9, 1};
//        System.out.println("排序前数组为：");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        for (int i = 0; i < arr.length - 1; i++) {//外层循环控制排序趟数
//            for (int j = 0; j < arr.length - 1 - i; j++) {//内层循环控制每一趟排序多少次
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j];
//                    arr[j] = arr[j + 1];
//                    arr[j + 1] = temp;
//                }
//            }
//            System.out.println();
//            System.out.println("排序后的数组为：");
//            for (int num : arr) {
//                System.out.print(num + " ");
//            }
//
//
//        }
    }

