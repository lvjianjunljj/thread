package thread3.com.mythread.www;

import thread3.service.Mylist1;

public class Mythread02 extends Thread {
	private Mylist1 list;
	public Mythread02(Mylist1 list) {
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		try {
			while(true){
				if(list.size() == 5){
					System.out.println("==5了，线程02要退出了");
					throw new InterruptedException();
				}
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
