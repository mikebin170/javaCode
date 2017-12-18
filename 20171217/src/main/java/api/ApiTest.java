package api;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import http.HttpUtils;

public class ApiTest {
	
	public static void main(String[] args) {
		//File.separator
		String path =System.getProperty("user.dir")+File.separator+"data"+File.separator;
		File file= new File(path+"data.txt");
		File fileresult= new File(path+"result.txt");
		try {
			List<String> lines = FileUtils.readLines(file,"utf-8");
			int count = 0;
			for (String line : lines) {
				if(count++>0) {
				  String[] rows =line.split(";");
				  String reString = null;
				  String type=rows[0];
				  String url = rows[1];
				  
				  if("get".equals(type)) {
					  reString = HttpUtils.doGet(url);
				  }else if("post".equals(type)) {
					  String params = rows[2];
					  reString = HttpUtils.doPostString(url, params,"&");
				  }
				  String result = url+ "结果-------" +reString+"\n";
				  //追加 true   覆盖false
				  FileUtils.writeStringToFile(fileresult, result, "utf-8", true);
				System.out.println(result);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
