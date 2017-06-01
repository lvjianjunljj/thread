package thread4.com.mythread.www;

import thread4.service.Service04;

public class Mythread07 extends Thread{
	private Service04 service;

	public Mythread07(Service04 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		service.await();
	}
}
