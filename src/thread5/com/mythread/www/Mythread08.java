package thread5.com.mythread.www;

import thread5.service.MyObject9;

public class Mythread08 extends Thread{
	@Override
	public void run() {
		super.run();
		for (int i = 0; i < 5; i++) {
			System.out.println(MyObject9.getInstance().hashCode());
		}
	}
}
