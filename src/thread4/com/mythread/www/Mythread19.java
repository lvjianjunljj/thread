package thread4.com.mythread.www;

import thread4.service.Service12;

public class Mythread19 extends Thread{
	private Service12 service;

	public Mythread19(Service12 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.write();
	}
}
