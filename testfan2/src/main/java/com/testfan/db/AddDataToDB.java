package com.testfan.db;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AddDataToDB {
	
	private static Connection getConn() {
	    String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://123.58.251.183:3306/test_wsl";
	    String username = "root";
	    String password = "123123";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,加载对应驱动
	        conn = DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	
	public static int insert(String id,String name,String pwd) {
		System.out.println(Thread.currentThread().getName());
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "insert into t_user (uuid,username,pwd,test) values(?,?,?,?)";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
	        pstmt.setString(1, id);
	        pstmt.setString(2, name);
	        pstmt.setString(3, pwd);
	        pstmt.setInt(4, 123);
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	
	public static int delDB() {
	    Connection conn = getConn();
	    int i = 0;
	    String sql = "delete from  t_user";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement) conn.prepareStatement(sql);
//	        pstmt.setString(1, id);
//	        pstmt.setString(2, name);
//	        pstmt.setString(3, pwd);
//	        pstmt.setInt(4, 123);
	        i = pstmt.executeUpdate();
	        pstmt.close();
	        conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return i;
	}
	
	static class DbThread implements Runnable{
		private int begin;
		private int end;
		
		public DbThread(int begin, int end) {
			super();
			this.begin = begin;
			this.end = end;
		}

		public void run() {
			for(int i=begin;i<end;i++){
				  String uid =UUID.randomUUID().toString();
				
				  int reulst = AddDataToDB.insert(uid,"testfan"+i,"test"+i);
				  System.out.println("reulst " + i);
				  
		     }
		}
		
	}
	


	public static void main(String[] args) {
		//MySqlDB db =new MySqlDB();
		
		  //int reulst = AddDataToDB.insert("123","test111","test111");
		delDB();
//		for(int i=0;i<100;i++){
//		  String uid =UUID.randomUUID().toString();
//		  int reulst = AddDataToDB.insert(uid,"testfan"+i,"test"+i);
//		  System.out.println("reulst " + i);
//		}
		
		int round=1000;
		int page = 0;
		ExecutorService fixedThreadPool = Executors.newFixedThreadPool(20);
		for(int i=0;i<20000;i++) {
			if(i%round==0) {
				System.out.println(page);
				int begin = (page)*round;
				int end = (page+1)*round;
				System.out.println("from --"+ begin + " to "+ end);
				fixedThreadPool.execute(new DbThread(begin,end));
				//new DbThread(begin, end).start();
				page++;
			}
		}
		
	}
}
	
	
