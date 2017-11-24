package com.testfan;

public class StringReverse {
  public static void main(String[] args) {
	  String test = "I love china";
	  System.out.println("BufferReverse "+ BufferReverse(test));
	  System.out.println("StringReverse" +  StringReverse(test));
}
  
  public static String BufferReverse(String str){  
      return new StringBuilder(str).reverse().toString();  
  }
  
  
  public static String StringReverse(final String str) {  
    String result = "";
      for (int i = str.length() - 1; i >= 0; i--) {  
          char c = str.charAt(i);  
          result+=c;
      }
      return result;
  } 
}
