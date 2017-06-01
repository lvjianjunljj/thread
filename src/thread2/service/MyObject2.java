package thread2.service;

public class MyObject2 {
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName="+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("methodA end!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
