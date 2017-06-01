package thread2.com.mythread.www;

import thread2.service.Task2;

public class Mythread18 extends Thread{
	private Task2 task;
	public Mythread18(Task2 task) {
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		task.doLongTimeTask();
	}
}
