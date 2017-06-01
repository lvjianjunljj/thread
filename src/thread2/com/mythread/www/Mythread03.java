package thread2.com.mythread.www;

import thread2.service.HasSelfPrivateNum2;

public class Mythread03 extends Thread {
	private HasSelfPrivateNum2 numRef;
	public Mythread03(HasSelfPrivateNum2 numRef) {
		super();
		this.numRef = numRef;
	}
	
	@Override
	public void run() {
		super.run();
		numRef.addI("a");
	}
}
