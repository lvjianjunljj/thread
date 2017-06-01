package thread3.com.mythread.www;

import thread3.service.Add;

public class Mythread10 extends Thread {
	private Add p;
	public Mythread10(Add p) {
		this.p = p;
	}
	@Override
	public void run() {
		super.run();
		p.add();
	}
}
