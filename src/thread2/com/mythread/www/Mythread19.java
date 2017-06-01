package thread2.com.mythread.www;

import thread2.service.ObjectService2;

public class Mythread19 extends Thread{
	private ObjectService2 service;
	public Mythread19(ObjectService2 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.serviceMethodA();
	}
}
