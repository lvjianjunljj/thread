package thread2.com.mythread.www;

import thread2.service.Serviced;

public class Mythread47 extends Thread {
	private Serviced service;

	public Mythread47(Serviced service) {
		this.service = service;
	}

	@Override
	public void run() {
		super.run();
		service.methodB();
	}
}
