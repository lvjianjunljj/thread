package thread5.com.mythread.www;

import thread5.service.MyObject1;

public class Mythread01 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject1.getInstance().hashCode());
	}
}
