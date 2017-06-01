package thread2.com.mythread.www;

import thread2.service.CommonUtils;
import thread2.service.Task;

public class Mythread14 extends Thread{
	private Task task;
	public Mythread14(Task task) {
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
