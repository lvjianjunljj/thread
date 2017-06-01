package thread2.com.mythread.www;

import thread2.service.Servicef;

public class Mythread51 extends Thread{
	private Servicef service;
	public Mythread51(Servicef service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.method();
	}
}
