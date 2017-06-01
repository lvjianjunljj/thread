package thread3.com.mythread.www;

import thread3.service.Mystack1;

public class Mythread17 extends Thread {
	private Mystack1 stack;
	public Mythread17(Mystack1 stack) {
		super();
		this.stack = stack;
	}
	@Override
	public void run() {
		super.run();
		while(true){
			stack.push();
		}
	}
	
}
