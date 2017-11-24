package com.testfan;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTest {
  public static void main(String[] args) {
	  //以三种方式遍历集合List
      
     // List<String> list = new ArrayList<String>();
      
      List<String> list = new ArrayList<String>();
      
      list.add("6");
      list.add("3");
      list.add("9");
      list.add("9");
      list.add("9");
      
      System.out.println("----------方式1-----------");
      //第一种方式，普通for循环
      for(int i = 0; i < list.size(); i++)
      {
          System.out.println(list.get(i));
          
      }
      
      System.out.println("----------方式2-----------");
      //第二种方式，使用迭代器
      for(Iterator<String> iter = list.iterator(); iter.hasNext();)
      {
          System.out.println(iter.next());
      }
      System.out.println("----------方式3-----------");
      //第三种方式，使用增强型的for循环
      for(String str: list)
      {
          System.out.println(str);
          
      }
      
//      System.out.println("----------数据反转-----------");
//      Collections.sort(list);
//      //Collections.reverse(list);
//      for (String string : list) {
//		System.out.println(string);
//	 }
}
}
