package thread2.com.mythread.www;

import thread2.service.CommonUtils;
import thread2.service.Task1;

public class Mythread16 extends Thread{
	private Task1 task;
	public Mythread16(Task1 task) {
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
