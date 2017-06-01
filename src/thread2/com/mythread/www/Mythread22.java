package thread2.com.mythread.www;

import thread2.service.Service2;

public class Mythread22 extends Thread {
	private Service2 service;
	public Mythread22(Service2 service) {
		super();
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.setUsernamePassword("b","bb");
	}
}
