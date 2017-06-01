package thread5.com.mythread.www;

import thread5.service.MyObject7;

public class Mythread07 extends Thread{
	@Override
	public void run() {
		super.run();
		System.out.println(MyObject7.getInstance().hashCode());
	}
}
