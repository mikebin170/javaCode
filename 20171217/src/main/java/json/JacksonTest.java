package json;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JacksonTest {
	
	public static void main(String[] args) {
		
		String json = "{\"name\":\"Ð¡Ãñ\",\"age\":20,\"birthday\":844099200000,\"email\":\"xiaomin@sina.com\"}";
		
		String jsonString4 = "[{\"age\":12,\"date\":1465475917155,\"name\":\"s1\"},"
        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s2\"},"
        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s3\"},"
        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s4\"},"
        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s5\"},"
        		+ "{\"age\":12,\"date\":1465475917175,\"name\":\"s6\"}]";  
		
		ObjectMapper mapper = new ObjectMapper();  
		
		try {
			long start =System.currentTimeMillis();
			JavaType javaType = mapper.getTypeFactory().constructParametricType(List.class, Student.class);  
			List<Student> st = (List<Student>) mapper.readValue(jsonString4, javaType);
			System.out.println(" it tooks "+(System.currentTimeMillis()-start));
			//System.out.println(st);
			long start1 =System.currentTimeMillis();
			  String jsonlist = mapper.writeValueAsString(st);  
			  System.out.println(" it tooks write "+(System.currentTimeMillis()-start1));
			  System.out.println(jsonlist);
		} catch (IOException e) {
			e.printStackTrace();
		}  
	}

}
