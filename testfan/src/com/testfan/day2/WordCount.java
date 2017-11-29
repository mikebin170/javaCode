package com.testfan.day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class WordCount {

	public static void main(String[] args) {
//		String str = "2342asfghgyu56asdasdaddddd";
//		Map<String, Integer> mapcount = new HashMap<String, Integer>();
//		for (int i = 0; i < str.length(); i++) {
//			String key = String.valueOf(str.charAt(i));
//			if (mapcount.containsKey(key)) {
//				int count = mapcount.get(key);
//				mapcount.put(key, count + 1);
//			} else {
//				mapcount.put(key, 1);
//			}
//		}
//
//		for (Object key : mapcount.keySet()) {
//			System.out.println(key + "-->" + mapcount.get(key));
//		}
//		
		String str = "ascdszksiaskdkfasf";// 定义字符串  
		String str2 = "fascdszksiaskdkfas";// 定义字符串  
		String str3 = "ascdszksiaskdkfasf";// 定义字符串  
		String str4 = "fascdszksiaskdkfasf";// 定义字符串  
		String testStr = "as";
		String comp1;
		String comp2;
		if(str.length()>testStr.length()){
			comp1 =str;
			comp2 = testStr;
		}else {
			comp1 =testStr;
			comp2 = str;
		}
//		
//		  System.out.println("as".indexOf("at"));
//		
		  System.out.println((comp1.split(comp2)).length-1);
		  System.out.println((str2.length()));
		  System.out.println((str2.lastIndexOf(testStr)));
		  System.out.println((str2.split(testStr)).length);
		  System.out.println((str3.split(testStr)).length-1);
		  System.out.println((str4.split(testStr)).length-1);
		
//		System.out.println(str.length());
////		System.out.println(str.indexOf(testStr));
//		System.out.println(str.lastIndexOf(testStr));
////		System.out.println(str.contains(testStr));
//		
//		String[] array = str.split(testStr);
//		System.out.println(array.length);
//		if(str.length()==testStr.length()+str.lastIndexOf(testStr)){
//			System.out.println(array.length);
//		}else{
//			System.out.println(array.length-1);
//		}
//		
//		for (String string : array) {
//			System.out.println(string);
//		}
		
	}

}
