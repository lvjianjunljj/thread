package thread5.com.mythread.www;

import thread5.service.MyObject2;

public class Mythread02 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject2.getInstance().hashCode());
	}
}
