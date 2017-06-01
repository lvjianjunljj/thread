package thread2.com.mythread.www;

import thread2.service.Service4;

public class Mythread25 extends Thread {
	private Service4 service;
	public Mythread25(Service4 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
