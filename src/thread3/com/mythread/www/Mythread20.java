package thread3.com.mythread.www;

import thread3.service.Customer3;

public class Mythread20 extends Thread {
	private Customer3 c;

	public Mythread20(Customer3 c) {
		super();
		this.c = c;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			c.popService();
		}
	}
}
