package thread4.com.mythread.www;

import thread4.service.Service03;

public class Mythread06 extends Thread {
	private Service03 service;

	public Mythread06(Service03 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.method();
	}
}
