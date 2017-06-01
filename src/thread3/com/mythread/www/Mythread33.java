package thread3.com.mythread.www;

import thread3.service.Tools1;

public class Mythread33 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 100; i++) {
				Tools1.t1.set("ThreadB"+(i+1));
				System.out.println("ThreadA getValue="+Tools1.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
