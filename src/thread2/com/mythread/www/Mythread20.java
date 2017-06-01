package thread2.com.mythread.www;

import thread2.service.ObjectService2;

public class Mythread20 extends Thread{
	private ObjectService2 service;
	public Mythread20(ObjectService2 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.serviceMethodB();
	}
}
