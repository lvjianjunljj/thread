package thread2.service;

public class Servicef {
	private String lock = "1234";
	public void method() {
		try {
			synchronized (lock) {
				System.out.println("threadName="+Thread.currentThread().getName()+"begin time="+System.currentTimeMillis());
				lock = "5678";
				Thread.sleep(2000);
				System.out.println("threadName="+Thread.currentThread().getName()+"end time="+System.currentTimeMillis());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
