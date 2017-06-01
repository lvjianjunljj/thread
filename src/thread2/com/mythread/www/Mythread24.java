package thread2.com.mythread.www;

import thread2.service.Service3;

public class Mythread24 extends Thread {
	private Service3 service;
	public Mythread24(Service3 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("b","bb");
	}
}
