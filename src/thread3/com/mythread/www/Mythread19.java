package thread3.com.mythread.www;

import thread3.service.Productor3;

public class Mythread19 extends Thread{
	private Productor3 p;

	public Mythread19(Productor3 p) {
		super();
		this.p = p;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			p.pushService();
		}
	}
}
