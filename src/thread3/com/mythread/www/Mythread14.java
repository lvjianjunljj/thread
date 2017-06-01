package thread3.com.mythread.www;

import thread3.service.Customer1;

public class Mythread14 extends Thread{
	private Customer1 c;

	public Mythread14(Customer1 c) {
		super();
		this.c = c;
	}
	@Override
	public void run() {
		super.run();
		while(true){
			c.getValue();
		}
	}
}
