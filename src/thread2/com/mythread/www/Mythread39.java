package thread2.com.mythread.www;

import thread2.service.Service9;

public class Mythread39 extends Thread{
	private Service9 service;
	public Mythread39(Service9 service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.printB();
	}
}
