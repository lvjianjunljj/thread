package thread3.com.mythread.www;

import thread3.service.Subtract;

public class Mythread11 extends Thread {
	private Subtract r;
	public Mythread11(Subtract r) {
		this.r = r;
	}
	@Override
	public void run() {
		super.run();
		r.subtract();
	}
}
