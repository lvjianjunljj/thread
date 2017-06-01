package thread3.com.mythread.www;

import thread3.service.Mylist1;

public class Mythread01 extends Thread {
	private Mylist1 list;
	public Mythread01(Mylist1 list) {
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		try {
			for (int i = 0; i < 10; i++) {
				list.add();
				System.out.println("添加了"+(i+1)+"个元素");
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
