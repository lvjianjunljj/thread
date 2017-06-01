package thread2.com.mythread.www;

import thread2.service.Service8;

public class Mythread37 extends Thread{
	private Service8 service;
	public Mythread37(Service8 service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.printC();
	}
}
