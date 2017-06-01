package thread3.com.mythread.www;

import thread3.service.Mylist2;

public class Mythread09 extends Thread {
	private Object lock = new Object();
	public Mythread09(Object lock) {
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		synchronized (lock) {
			lock.notifyAll();
		}
	}
}
