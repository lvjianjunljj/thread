package thread2.com.mythread.www;

import thread2.service.Servicei;

public class Mythread59 extends Thread {
	private Servicei service = new Servicei();
	public Mythread59(Servicei service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.stop();
	}
}
