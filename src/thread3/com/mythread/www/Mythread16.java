package thread3.com.mythread.www;

import thread3.service.Customer2;

public class Mythread16 extends Thread{
	private Customer2 c;

	public Mythread16(Customer2 c) {
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
