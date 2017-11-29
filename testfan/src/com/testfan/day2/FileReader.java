package com.testfan.day2;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReader {
	
	 public static void readTxtFile1(String path) throws IOException{
		
	        FileInputStream fis = new FileInputStream(path);  
	      
	        //创建一个长度为1024的内存空间，1024足够大
	        byte[] bbuf = new byte[1024];  
	          
	        //用于保存实际读取的字节数           
	        int hasRead = 0;  
	        //使用循环来重复读取数据  
	        while( (hasRead = fis.read(bbuf)) > 0){  
	              
	            //将字节数组转换为字符串输出  
	            System.out.print(new String(bbuf,0,hasRead));  
	              
	        }  
	          
	        //关闭文件输出流，放在finally块里更安全  
	        fis.close();  
	 }
	
	public static void main(String[] args) {
		try {
			readTxtFile1("E:\\data\\test\\test3\\testfan.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
