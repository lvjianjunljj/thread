package thread2.com.mythread.www;

import thread2.service.HasSelfPrivateNum1;

public class Mythread02 extends Thread {
	private HasSelfPrivateNum1 numRef;
	public Mythread02(HasSelfPrivateNum1 numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("b");
	}
}
