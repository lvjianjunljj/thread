package thread3.service;

public class Service1 {
	public void method(Object lock) {
		try {
			synchronized (lock) {
				System.out.println("begin wait() threadName="+Thread.currentThread().getName());
				lock.wait();
				System.out.println("end wait() threadName="+Thread.currentThread().getName());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
