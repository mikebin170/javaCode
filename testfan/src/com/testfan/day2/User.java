package com.testfan.day2;

public class User{
	private String name;
	private int age;
	private int score;
	
	
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public User(){
		
	}
	
	public User(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

//	@Override
//	public int compareTo(User o) {
//		if(o!=null){
//			if(this.getAge()>o.getAge()){
//				return -1;
//			}else{
//				return 1;	
//			}
//		}
//		
//		return 0;
//	}

	
	
//	@Override
//	public int compareTo(Object o) {
//		if(o!=null&&o instanceof User){
//			User o1 = (User)o;
//			if(this.getAge()>o1.getAge()){
//				return 1;
//			}else{
//				return -1;
//			}
//		}
//		return 0;
//	}
	

	
}
