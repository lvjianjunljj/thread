package thread2.com.mythread.www;

import thread2.service.Servicec;

public class Mythread45 extends Thread{
	private Servicec service;
	public Mythread45(Servicec service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.print(new Object());
	}
}
