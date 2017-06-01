package thread3.com.mythread.www;

import thread3.service.Tools4;

public class Mythread36 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Mythread35 value="+Tools4.t1.get());
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
