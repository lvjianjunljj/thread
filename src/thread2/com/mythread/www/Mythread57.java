package thread2.com.mythread.www;

import thread2.service.Serviceh;

public class Mythread57 extends Thread {
	private Serviceh service = new Serviceh();
	public Mythread57(Serviceh serivce) {
		this.service = serivce;
	}
	@Override
	public void run() {
		super.run();
		service.addNum();
	}
}
