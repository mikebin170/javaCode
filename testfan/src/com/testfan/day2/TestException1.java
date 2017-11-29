package com.testfan.day2;

public class TestException1 {
	public static void main(String[] args) throws MyException, AgeCheck {
		try {
			System.out.println(3 / 0);
			System.out.println(1/3.0);
		} catch (Exception e) {
			throw new MyException("dd");
		}finally {
			System.out.println("1111111111");
		}

		System.out.println("22222222222222");
		int age=-1;
		if(age<0){
			throw new AgeCheck("ÄêÁäÒì³£");
		}
		System.out.println(1/3.0);

		
		
	}
}
