package thread2.com.mythread.www;

import thread2.service.ObjectService;

public class Mythread15 extends Thread{
	private ObjectService service;
	public Mythread15(ObjectService service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.method();
	}
}
