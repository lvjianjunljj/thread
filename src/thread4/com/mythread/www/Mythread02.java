package thread4.com.mythread.www;

import thread4.service.Service02;

public class Mythread02 extends Thread {
	private Service02 service;

	public Mythread02(Service02 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
