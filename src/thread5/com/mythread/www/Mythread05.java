package thread5.com.mythread.www;

import thread5.service.MyObject5;

public class Mythread05 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject5.getInstance().hashCode());
	}
}
