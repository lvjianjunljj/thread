package thread3.com.mythread.www;

import thread3.service.Tools3;

public class Mythread35 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("Mythread35 value="+Tools3.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
