package thread2.com.mythread.www;

import thread2.service.Servicea;

public class Mythread41 extends Thread{
	private Servicea service;
	public Mythread41(Servicea service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.printB();
	}
}
