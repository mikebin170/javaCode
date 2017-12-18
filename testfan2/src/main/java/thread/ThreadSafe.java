package thread;


public class ThreadSafe {
    //全局变量
	private static int a=0;
	
	private static void threadTest() {  
	    for (int i = 0; i < 10; i++) {  
	        new Thread() {  
	            public void run() {  
	            	//synchronized (ThreadSafe.class) { 
	                a++;  
	                try {  
	                    Thread.sleep(1);  
	                } catch (InterruptedException e) {  
	                    e.printStackTrace();  
	                }
	                System.out.println("plus:" + Thread.currentThread().getName() + ": " + a);  
	            }
	            //}
	        }.start();  
	    }  
	} 
	
	public static void main(String[] args) {
		threadTest();
	}
	

}
