package thread2.com.mythread.www;

import thread2.service.CommonUtils;
import thread2.service.Task1;

public class Mythread17 extends Thread{
	private Task1 task;
	public Mythread17(Task1 task) {
		super();
		this.task = task;
	}
	@Override
	public void run() {
		super.run();
		CommonUtils.beginTime2 = System.currentTimeMillis();
		task.doLongTimeTask();
		CommonUtils.endTime2 = System.currentTimeMillis();
	}
}
