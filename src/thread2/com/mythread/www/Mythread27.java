package thread2.com.mythread.www;

import thread2.service.Mylist;



public class Mythread27 extends Thread{
	private Mylist list = new Mylist();
	public Mythread27(Mylist list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		for(int i=0;i<1000;i++){
			list.add("ThreadA"+(i+1));
		}
	}
}
