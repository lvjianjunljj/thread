package thread4.com.mythread.www;

import thread4.service.Service08;

public class Mythread14 extends Thread{
	private Service08 service;

	public Mythread14(Service08 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			service.set();
		}
	}
}
