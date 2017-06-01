package thread5.com.mythread.www;

import thread5.service.MyObject3;

public class Mythread03 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject3.getInstance().hashCode());
	}
}
