package thread2.service;

public class MyObject3 {
	synchronized public void methodA(){
		try {
			System.out.println("begin methodA threadName="+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("methodA end!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	/*synchronized*/ public void methodB(){
		try {
			System.out.println("begin methodB threadName="+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("methodB end!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
