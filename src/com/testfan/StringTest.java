package com.testfan;

public class StringTest {
	public static void main(String[] args) {
		
		    String str1="aaa";
		    String str2="aaa";
		    System.out.println("===========test1============");
		    System.out.println(str1==str2);//true 可以看出str1跟str2是指向同一个对象 
		    
		    //new String() 创建的字符串不放入常量池中
		    String str3=new String("aaa");
		    String str4=new String("aaa");
		    System.out.println("===========test2============");
		    System.out.println(str3==str4);//false 可以看出用new的方式是生成不同的对象 
		    System.out.println(str3.equals(str4));//true
		    
		    StringBuffer sb = new StringBuffer("TestString");
		    sb.insert(4,false);
            System.out.println(sb.toString());
		    
		    
		    
	}

}
