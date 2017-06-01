package thread4.com.mythread.www;

import thread4.service.Service07;

public class Mythread13 extends Thread{
	private Service07 service;

	public Mythread13(Service07 service) {
		super();
		this.service = service;
	}
	
	@Override
	public void run() {
		super.run();
		while(true){
			service.get();
		}
	}
}
