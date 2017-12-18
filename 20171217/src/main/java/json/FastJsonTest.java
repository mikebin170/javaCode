package json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;

public class FastJsonTest {
	
	public static void main(String[] args) {
		   String jsonString1 = "{\"param5\":\"value5\",\"param3\":\"value3\",\"param4\":\"value4\",\"param1\":\"value1\",\"param2\":\"value2\"}";  
	        System.out.println(jsonString1);  
	        JSONObject object = (JSONObject) JSON.parse(jsonString1);
	        System.out.println(object.get("param5"));
	        Map<String,String> stringStringMap = (Map<String,String>)JSON.parse(jsonString1);  
	        for (String s : stringStringMap.keySet()) {  
	            System.out.println(s + "==>" +stringStringMap.get(s));  
	        }  
	        System.out.println("===================================================");
	        
	        
	        String jsonString2 = "[{\"param5\":\"value5\",\"param3\":\"value3\",\"param4\":\"value4\",\"param1\":\"value1\",\"param2\":\"value2\"},"
	        		+ "{\"p1\":\"v1\",\"p2\":\"v2\",\"p3\":\"v3\",\"p4\":\"v4\",\"p5\":\"v5\"}]";  
	        System.out.println(jsonString2);  
	        List<Map<String,String>> mapList = JSON.parseObject(jsonString2, new TypeReference<List<Map<String,String>>>(){});  
	        for (Map<String, String> stringObjectMap : mapList) {  
	            for (String s : stringObjectMap.keySet()) {  
	                System.out.println(s + "==>" + stringObjectMap.get(s));  
	            }  
	        }  
	        
	        
	        System.out.println("===================================================");  
	        
	        
	      //解析已有的对象  
	        String jsonString4 = "[{\"age\":12,\"date\":1465475917155,\"name\":\"s1\"},"
	        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s2\"},"
	        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s3\"},"
	        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s4\"},"
	        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s5\"},"
	        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s6\"}]";  
	        System.out.println(jsonString4);
	        
	        long start =System.currentTimeMillis();
	        List<Student> studentList = JSON.parseArray(jsonString4,Student.class); 
	        System.out.println(" it tooks "+(System.currentTimeMillis()-start));
	        
	        Map<String,String> map = new HashMap<String,String>();
	        map.put("username", "123");
	        System.out.println("maptoString"+ JSON.toJSONString(map));
	        
	        long start1 =System.currentTimeMillis();
	        System.out.println("-------"+ JSON.toJSONString(studentList));
	        System.out.println(" it tooks write "+(System.currentTimeMillis()-start1));
	        
	        for (Student student : studentList) {  
	            System.out.println(student.getName());  
	        }  
	        System.out.println("===================================================");  
	  
	        //解析已有的对象的另一种方式  
	        System.out.println(jsonString4);  
	        List<Student> studentList2 = JSON.parseObject(jsonString4,new TypeReference<List<Student>>(){});  
	        for (Student student : studentList2) {  
	            System.out.println(student.getName());  
	        } 
	        
	      
	}

}
