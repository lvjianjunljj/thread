package thread2.com.mythread.www;

import thread2.service.Service7;

public class Mythread34 extends Thread{
	@Override
	public void run() {
		super.run();
		Service7.printB();
	}
}
