package thread2.com.mythread.www;

import thread2.service.CommonUtils;
import thread2.service.Task;

public class Mythread13 extends Thread{
	private Task task;
	public Mythread13(Task task) {
		super();
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime1 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime1 = System.currentTimeMillis();
	}
}
