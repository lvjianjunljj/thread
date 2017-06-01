package thread2.com.mythread.www;

import thread2.service.Servicec;

public class Mythread44 extends Thread{
	private Servicec service;
	public Mythread44(Servicec service) {
		this.service = service;
	}
	@Override
	public void run() {
		super.run();
		service.print(new Object());
	}
}
