package com.testfan.day2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FileReader2 {
	
	
	 public static void readTxtFile(String filePath){
	        try {
	                String encoding="UTF-8";
	                File file=new File(filePath);
	                if(file.isFile() && file.exists()){ //判断文件是否存在
	                	FileInputStream in = new FileInputStream(file);
	                    InputStreamReader read = new InputStreamReader(in,encoding);//考虑到编码格式
	                    BufferedReader bufferedReader = new BufferedReader(read);
	                    String lineTxt = null;
	                    List<User> list = new ArrayList<User>();
	                    while((lineTxt = bufferedReader.readLine()) != null){
	                    	String[] array = lineTxt.split(";");
	                    	User user =new User();
	                    	user.setName(array[0]);
	                    	user.setName(array[1]);
	                    	list.add(user);
	                        //System.out.println(array[0]+ " "+ array[1]);
	                    }
	                    for(User user: list)
	                    {
	                        System.out.println(user.getName());
	                        
	                    }
	                    read.close();
	        }else{
	            System.out.println("找不到指定的文件");
	        }
	        } catch (Exception e) {
	            System.out.println("读取文件内容出错");
	            e.printStackTrace();
	        }
	     
	    }
	
	public static void main(String[] args) {
		readTxtFile("E:\\data\\test\\test3\\testfan.txt");
	}

}
