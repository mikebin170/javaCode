package upload;

import java.io.File;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import http.HttpClientException;
import http.HttpUtils;

public class UploadFile {
	
	public static void main(String[] args) {
		String path =System.getProperty("user.dir")+File.separator+"data"+File.separator;
		File file= new File(path+"1.txt");
		File descfile= new File(path+"2.txt");
		System.out.println(file.getPath());
		System.out.println(descfile.getPath());
		String reString;
		try {
			reString = HttpUtils.doUpload("http://123.58.251.183:8080/FileSever/upload.do", file);
			System.out.println(reString);
			JSONObject jsonObject = (JSONObject) JSON.parse(reString);
			String fileId = jsonObject.getString("fileId");
			
			String reString2 = HttpUtils.doGet("http://123.58.251.183:8080/FileSever/url.do?fileId="+fileId);
			System.out.println(reString2);
			JSONObject jsonObject2 = (JSONObject) JSON.parse(reString2);
			String url = jsonObject2.getString("url");
			
			HttpUtils.doDown(url,descfile);
		} catch (HttpClientException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
