package thread4.com.mythread.www;

import thread4.service.Service01;

public class Mythread01 extends Thread {
	private Service01 service;

	public Mythread01(Service01 service) {
		super();
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.method();
	}
}
