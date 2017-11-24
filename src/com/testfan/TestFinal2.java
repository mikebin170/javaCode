package com.testfan;

class TestFinal {
	static{
		System.out.println("1111");
	}
	
	public TestFinal(){
		System.out.println("TestFinal ");
	}
	 
	public String name="11";
	
	
	public void f1() {
		System.out.println("f1");
	}

	// 无法被子类覆盖的方法
	public final void f2() {
		System.out.println("f2");
	}

	private void f3() {
		
		System.out.println("f4");
	}

	public String getName() {
		return name;
	}
	
}


public class TestFinal2 extends TestFinal {
	
	public TestFinal2(){
		System.out.println("TestFinal2 ");
	}
	
    public void f3() {
    	this.f3();
		System.out.println("f4");
	}

	public void f1() {
		//super.f1();
		System.out.println("Test1父类方法f1被覆盖!");
	}
	
//	public void f2() {
//		System.out.println("f2");
//	}

	public static void main(String[] args) {
		TestFinal2 t = new TestFinal2();
		TestFinal2 t2 = new TestFinal2();
		TestFinal2 t3 = new TestFinal2();
		//t3.f3();
		
		//TestFinal t1 = new TestFinal();
	
		//t.name="111";
		t.f1();
		//t.f2(); // 调用从父类继承过来的final方法
	    //t.f3(); //调用失败，无法从父类继承获得
	}
}
