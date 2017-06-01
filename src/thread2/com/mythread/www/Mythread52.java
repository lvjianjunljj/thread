package thread2.com.mythread.www;

import thread2.service.Serviceg;
import thread2.service.UserInfo;

public class Mythread52 extends Thread {
	private Serviceg service;
	private UserInfo userinfo;
	public Mythread52(Serviceg service,UserInfo userinfo) {
		this.service = service;
		this.userinfo = userinfo;
	}
	@Override
	public void run() {
		super.run();
		service.method(userinfo);
	}
}
