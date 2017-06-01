package thread4.com.mythread.www;

import thread4.service.Service06;

public class Mythread10 extends Thread {
	private Service06 service;

	public Mythread10(Service06 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.awaitA();
	}
}
