package thread2.com.mythread.www;

import thread2.service.MyObject1;

public class Mythread05 extends Thread {
	private MyObject1 object;
	
	public Mythread05(MyObject1 object) {
		this.object = object;
	}
	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
