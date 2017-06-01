package thread4.com.mythread.www;

import thread4.service.Service05;

public class Mythread08 extends Thread {
	private Service05 service;

	public Mythread08(Service05 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.awaitA();
	}
}
