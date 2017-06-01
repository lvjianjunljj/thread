package thread3.com.mythread.www;

import thread3.service.Producter1;

public class Mythread13 extends Thread{
	private Producter1 p;

	public Mythread13(Producter1 p) {
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
