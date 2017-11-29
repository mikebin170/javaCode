package com.testfan.day2;

import java.io.File;
import java.io.IOException;

public class FileTest {
	
	public static void main(String[] args) {
		File f = new File("e:"+File.separator+"data\\test\\test3\\testfan.txt");
		File dir = new File("e:\\data\\test\\test3");
		if(!dir.exists()){
			dir.mkdirs();
		}
		
		if(!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
//		File dir = new File("c:\\mydata\\test");
//		if(!dir.isDirectory()){
//			dir.mkdirs();
//		}
//		
//		
//		if(!f.exists()){
//			f.createNewFile();
//		}
//		 
		System.out.println(f.exists());
		System.out.println(f.getAbsoluteFile());
		System.out.println(f.length());
	}

}
