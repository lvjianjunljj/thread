package thread2.com.mythread.www;

import thread2.service.Serviced;

public class Mythread46 extends Thread{
	private Serviced service;
	public Mythread46(Serviced service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
