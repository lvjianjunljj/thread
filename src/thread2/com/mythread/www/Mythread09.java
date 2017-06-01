package thread2.com.mythread.www;

import thread2.service.PublicVar1;

public class Mythread09 extends Thread {
	private PublicVar1 publicVar;
	
	public Mythread09(PublicVar1 publicVar) {
		this.publicVar = publicVar;
	}
	@Override
	public void run() {
		super.run();
		publicVar.setValue("B", "BB");
	}
}
