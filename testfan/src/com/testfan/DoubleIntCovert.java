package com.testfan;

public class DoubleIntCovert {
	public static void main(String[] args) {
		double firstAvg = 81.29;
		int rise = 2;

		System.out.println(firstAvg + rise);

		//截取 
		System.out.println((int)(firstAvg + rise));

		//补齐
		System.out.println((double)(81 + rise));

	}
}
