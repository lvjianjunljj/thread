package thread2.com.mythread.www;

import thread2.service.MyObject3;

public class Mythread08 extends Thread {
	private MyObject3 object;
	
	public Mythread08(MyObject3 object) {
		this.object = object;
	}
	@Override
	public void run() {
		super.run();
		object.methodB();
	}
}
