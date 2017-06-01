package thread2.com.mythread.www;

import thread2.service.Mylist2;
import thread2.service.Service6;



public class Mythread31 extends Thread{
	private Mylist2 list = new Mylist2();
	public Mythread31(Mylist2 list) {
		super();
		this.list = list;
	}
	@Override
	public void run() {
		super.run();
		Service6 service = new Service6();
		service.addData(list, "A");
	}
}
