package com.testfan.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsTest {
	public static void main(String args[]) {  
        //注意List是实现Collection接口的  
		List<Double> list =new ArrayList<Double>();
        double array[] = { 112, 111, 23, 456, 231 };  
        for (int i = 0; i < array.length; i++) {  
            list.add(new Double(array[i]));  
        }  
        System.out.println(list.size());
        Collections.sort(list);  
        System.out.println(" 排序 -----------");
        for (int i = 0; i < array.length; i++) {  
            System.out.println(list.get(i));  
        }  
        System.out.println(" 反转 ------------ ");
        Collections.reverse(list); 
        for (Object d : list) {
		   System.out.println(d);	
		}
//        
        System.out.println(" 洗牌 ------------ "); 
        Collections.shuffle(list);
        for (Object d : list) {
 		   System.out.println(d);	
 		}
//        
        System.out.println("最大值"+ Collections.max(list));	
        
        System.out.println("最小值"+ Collections.min(list));
        
        List<User> list2 = new ArrayList<User>();
        list2.add(new User("test1",18));
        list2.add(new User("test2",20));
        list2.add(new User("test3",10));
        
        User user =new User();
        user.setName("test4");
        user.setAge(1);
        list2.add(user);
        //Collections.sort(list2);
        Collections.sort(list2, new MyCompare());
        for (User d : list2) {
 		   System.out.println(d.getName()+ " "+d.getAge());	
 		}
        
//        user.setAge(age);
        
    }  
}
