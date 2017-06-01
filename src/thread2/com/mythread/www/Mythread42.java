package thread2.com.mythread.www;

import thread2.service.Serviceb;

public class Mythread42 extends Thread{
	private Serviceb service;
	public Mythread42(Serviceb service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.print("AA");
	}
}
