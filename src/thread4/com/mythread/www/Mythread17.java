package thread4.com.mythread.www;

import thread4.service.Service10;

public class Mythread17 extends Thread{
	private Service10 service;

	public Mythread17(Service10 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.notifyMethod();
	}
}
