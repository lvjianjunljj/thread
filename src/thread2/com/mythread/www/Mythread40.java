package thread2.com.mythread.www;

import thread2.service.Servicea;

public class Mythread40 extends Thread{
	private Servicea service;
	public Mythread40(Servicea service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.printA();
	}
}
