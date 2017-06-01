package thread3.com.mythread.www;

import thread3.service.Tools2;

public class Mythread34 extends Thread {
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println("在线程Thread34中的值="+Tools2.t1.get());
				Thread.sleep(200);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
