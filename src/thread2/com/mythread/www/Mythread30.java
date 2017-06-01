package thread2.com.mythread.www;

import thread2.service.Mylist2;
import thread2.service.Service5;



public class Mythread30 extends Thread{
	private Mylist2 list = new Mylist2();
	public Mythread30(Mylist2 list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		Service5 service = new Service5();
		service.addData(list, "B");
	}
}
