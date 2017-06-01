package thread2.service;

public class MyObject1 {
	public void methodA(){
		try {
			System.out.println("begin methodA threadName="+Thread.currentThread().getName());
			Thread.sleep(2000);
			System.out.println("end!!!");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
