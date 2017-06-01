package thread3.com.mythread.www;

import thread3.service.Mylist2;

public class Mythread05 extends Thread {
	private Object lock = new Object();
	public Mythread05(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				if (Mylist2.size() != 5) {
					System.out.println("wait begin time="+System.currentTimeMillis());
					lock.wait();
					System.out.println("wait end time="+System.currentTimeMillis());
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
