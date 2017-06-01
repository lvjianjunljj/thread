package thread4.com.mythread.www;

import thread4.service.Service13;

public class Mythread21 extends Thread{
	private Service13 service;

	public Mythread21(Service13 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.write();
	}
}
