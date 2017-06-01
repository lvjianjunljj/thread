package thread2.com.mythread.www;

import thread2.service.Service3;

public class Mythread23 extends Thread {
	private Service3 service;
	public Mythread23(Service3 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("a","aa");
	}
}
