package thread4.com.mythread.www;

import thread4.service.Service13;

public class Mythread20 extends Thread{
	private Service13 service;

	public Mythread20(Service13 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.read();
	}
}
