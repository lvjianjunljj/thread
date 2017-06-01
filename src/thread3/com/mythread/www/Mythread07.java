package thread3.com.mythread.www;

import thread3.service.Mylist2;
import thread3.service.Service1;

public class Mythread07 extends Thread {
	private Object lock = new Object();
	public Mythread07(Object lock) {
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		Service1 service = new Service1();
		service.method(lock);
	}
}
