package thread2.com.mythread.www;

import thread2.service.Sub;

public class Mythread11 extends Thread{
	@Override
	public void run() {
		super.run();
		Sub sub = new Sub();
		sub.subMethod();
	}
}
