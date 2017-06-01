package thread4.com.mythread.www;

import thread4.service.Service11;

public class Mythread18 extends Thread{
	private Service11 service;

	public Mythread18(Service11 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.read();
	}
}
