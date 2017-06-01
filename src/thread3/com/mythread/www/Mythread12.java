package thread3.com.mythread.www;

import thread3.service.Subtract2;

public class Mythread12 extends Thread {
	private Subtract2 r;
	public Mythread12(Subtract2 r) {
		this.r = r;
	}
	@Override
	public void run() {
		super.run();
		r.subtract();
	}
}
