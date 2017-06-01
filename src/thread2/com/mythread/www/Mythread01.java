package thread2.com.mythread.www;

import thread2.service.HasSelfPrivateNum1;

public class Mythread01 extends Thread {
	private HasSelfPrivateNum1 numRef;
	public Mythread01(HasSelfPrivateNum1 numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
