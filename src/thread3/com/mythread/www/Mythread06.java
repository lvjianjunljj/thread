package thread3.com.mythread.www;

import thread3.service.Mylist2;

public class Mythread06 extends Thread {
	private Object lock = new Object();
	public Mythread06(Object lock) {
		super();
		this.lock = lock;
	}
	@Override
	public void run() {
		super.run();
		try {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					Mylist2.add();
					if(Mylist2.size() == 5){
						lock.notify();
						System.out.println("已经发出了通知");
					}
					System.out.println("已经添加了"+(i+1)+"个元素");
					Thread.sleep(500);
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
