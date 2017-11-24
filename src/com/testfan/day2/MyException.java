package com.testfan.day2;

public class MyException extends Exception{

 private String msg="";

public MyException(String msg) {
	super();
	this.msg = msg;
}

public String getMsg() {
	return msg;
}

 

}
