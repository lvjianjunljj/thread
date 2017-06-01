package thread2.com.mythread.www;

import thread2.service.Serviceb;

public class Mythread43 extends Thread{
	private Serviceb service;
	public Mythread43(Serviceb service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.print("AA");
	}
}
