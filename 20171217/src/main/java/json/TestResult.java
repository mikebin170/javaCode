package json;

import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

class User{
	private String name;
	private String pwd;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}

public class TestResult {
	private String msg;
	private String uid;
	private String code;
	@JSONField(name="data") 
	private List<User> userList;
	
	//@JSONField(name="data") 
	public List<User> getUserList() {
		return userList;
	}
	public void setUserList(List<User> userList) {
		this.userList = userList;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "TestResult [msg=" + msg + ", uid=" + uid + ", code=" + code + "]";
	}

}
