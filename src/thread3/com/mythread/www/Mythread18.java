package thread3.com.mythread.www;

import thread3.service.Mystack1;

public class Mythread18 extends Thread {
	private Mystack1 stack;
	public Mythread18(Mystack1 stack) {
		super();
		this.stack = stack;
	}
	@Override
	public void run() {
		super.run();
		while(true){
			System.out.println("pop="+stack.pop());
		}
	}
	
}
