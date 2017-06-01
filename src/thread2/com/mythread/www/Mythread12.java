package thread2.com.mythread.www;

import thread2.service.Sub1;

public class Mythread12 extends Thread{
	private Sub1 sub;
	public Mythread12(Sub1 sub) {
		this.sub = sub;
	}
	@Override
	public void run() {
		super.run();
		sub.subMethod();
	}
}
