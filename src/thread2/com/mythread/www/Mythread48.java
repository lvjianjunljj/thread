package thread2.com.mythread.www;

import thread2.service.Servicee;

public class Mythread48 extends Thread{
	private Servicee service;
	public Mythread48(Servicee service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.methodA();
	}
}
