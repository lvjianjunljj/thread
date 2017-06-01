package thread2.com.mythread.www;

import thread2.service.Service8;

public class Mythread36 extends Thread{
	private Service8 service;
	public Mythread36(Service8 service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.printB();
	}
}
