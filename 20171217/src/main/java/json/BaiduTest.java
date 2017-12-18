package json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import http.HttpClientException;
import http.HttpUtils;

public class BaiduTest {
	
	public static void main(String[] args) {
			//String reString = HttpUtils.doGet("http://www.baidu.com");
			Map<String, Object> params = new HashMap<String,Object>();
			params.put("method", "loginMobile");
			params.put("loginname", "test1");
			params.put("loginpass", "test1");
			
			try {
				String reString =HttpUtils.doPost("http://123.58.251.183:8080/goods/UserServlet", params);
				System.out.println(reString);
				JSONObject object = (JSONObject) JSON.parse(reString);
				Map<String, String> objectmp = (Map<String, String>) JSON.parse(reString);
				System.out.println(object.get("uid"));
				System.out.println(objectmp.get("code"));
				TestResult result= JSON.parseObject(reString,TestResult.class);
				
				System.out.println(result);
			} catch (HttpClientException e) {
				e.printStackTrace();
			}
	}

}
