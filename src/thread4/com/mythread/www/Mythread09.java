package thread4.com.mythread.www;

import thread4.service.Service05;

public class Mythread09 extends Thread {
	private Service05 service;

	public Mythread09(Service05 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.awaitB();
	}
}
