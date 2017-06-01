package thread2.com.mythread.www;

import thread2.service.Service;

public class Mythread10 extends Thread {
	private Service service;
	public Mythread10(Service service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.service1();
	}
}
