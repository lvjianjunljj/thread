package thread2.com.mythread.www;

import thread2.service.Mylist;



public class Mythread28 extends Thread{
	private Mylist list = new Mylist();
	public Mythread28(Mylist list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		for(int i=0;i<1000;i++){
			list.add("ThreadB"+(i+1));
		}
	}
}
