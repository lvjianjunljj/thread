package thread5.com.mythread.www;

import thread5.service.MyObject4;

public class Mythread04 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject4.getInstance().hashCode());
	}
}
