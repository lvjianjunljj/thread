package thread5.com.mythread.www;

import thread5.service.MyObject6;

public class Mythread06 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject6.getInstance().hashCode());
	}
}
