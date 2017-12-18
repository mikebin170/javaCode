package json;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSON;

import http.HttpClientException;
import http.HttpUtils;

public class PostJsonTest {
	
	public static void main(String[] args) {
		String url ="http://123.58.251.183:8080/goods/json2";
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("count", 2);
		String jsonParam = JSON.toJSONString(map);
		
		Map<String, Object> header = new HashMap<String,Object>();
		header.put("token", "61b3590090982a0185dda9d3bd793b46");
		
		try {
			String reString = HttpUtils.doPostJson(url, jsonParam, header);
			System.out.println(reString);
		} catch (HttpClientException e) {
			e.printStackTrace();
		}
	}

}
