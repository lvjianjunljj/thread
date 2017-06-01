package thread2.com.mythread.www;

import thread2.service.Mylist2;
import thread2.service.Service5;



public class Mythread29 extends Thread{
	private Mylist2 list = new Mylist2();
	public Mythread29(Mylist2 list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		Service5 service = new Service5();
		service.addData(list, "A");
	}
}
