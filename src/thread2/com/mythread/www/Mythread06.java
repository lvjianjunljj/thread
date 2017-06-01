package thread2.com.mythread.www;

import thread2.service.MyObject2;

public class Mythread06 extends Thread {
	private MyObject2 object;
	
	public Mythread06(MyObject2 object) {
		this.object = object;
	}
	@Override
	public void run() {
		super.run();
		object.methodA();
	}
}
