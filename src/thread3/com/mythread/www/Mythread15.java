package thread3.com.mythread.www;

import thread3.service.Producter2;

public class Mythread15 extends Thread{
	private Producter2 p;

	public Mythread15(Producter2 p) {
		super();
		this.p = p;
	}
	@Override
	public void run() {
		super.run();
		while(true){
			p.setValue();
		}
	}
}
