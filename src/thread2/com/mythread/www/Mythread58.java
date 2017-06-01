package thread2.com.mythread.www;

import thread2.service.Servicei;

public class Mythread58 extends Thread {
	private Servicei service = new Servicei();
	public Mythread58(Servicei service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.run();
	}
}
