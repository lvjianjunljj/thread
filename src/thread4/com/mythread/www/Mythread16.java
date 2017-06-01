package thread4.com.mythread.www;

import thread4.service.Service10;

public class Mythread16 extends Thread{
	private Service10 service;

	public Mythread16(Service10 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.waitMethod();
	}
}
