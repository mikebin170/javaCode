package com.testfan;

/*
 * 冒泡排序
 */
// 问题1 如果10个数据需要多少趟来排序?
// 问题2 每次内部排序干的什么？
//问题3 每次内部排序都一样次数吗？
//http://www.cnblogs.com/shen-hua/p/5422676.html
public class BubbleSort {
	public static void main(String[] args) {
		String t = "";
		int[] arr = { 6, 3, 8, 2, 9, 1 };
		System.out.println(" 排序前");
		for (int i : arr) {
			System.out.print(i);
		}
		System.out.println();
		// 算法思想是每次选出一个值
		for (int i = 0; i < arr.length - 1; i++) {// 外层循环控制排序趟数
			for (int j = 0; j < arr.length-1-i; j++) {// 内层循环控制每一趟排序多少次,把最大值往后
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}

		}
		System.out.println("排序后的数组为");
		for (int i : arr) {
			System.out.print(i);
		}

	}
}