package com.testfan;

import java.util.HashMap;
import java.util.Map;

public class ArithmeticTest {
public static void main(String[] args) {
	
	//
	String str ="2342asfghgyu56asdasda";
    Map<String,Integer> maps = new HashMap<String,Integer>();
    for(int i=0;i<str.length();i++){
 	   String key = String.valueOf((str.charAt(i)));
 	   if(!maps.containsKey(key))
 	       maps.put(key, 1);
 	   else{
 		   int val =maps.get(key);
 		   maps.put(key, val+1);
 	   }
 	   
    }
    
    for(Map.Entry i : maps.entrySet()){
 	   System.out.println(i.getKey()+ "=="+i.getValue());
    }
	
//System.out.println(3/0);
	
//	System.out.println("-------------");
//	System.out.println(100%20);
//	System.out.println("-------------");
	//·ÖÒ³Ëã·¨ 
//	int totalRows=105;
//	int pagesize = 20;
//	int totalPages;
//	
//	 if ((totalRows % pagesize) == 0) {
//         totalPages = totalRows / pagesize;
//     } else {
//         totalPages = totalRows / pagesize + 1;
//     }
//	 
//	 System.out.println("totalPages---------" + totalPages);
	
	
}
}
