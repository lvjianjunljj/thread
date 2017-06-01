package thread2.service;

public class Serviceg {
	public void method(UserInfo userinfo){
		synchronized (userinfo) {
			try {
				System.out.println("threadName="+Thread.currentThread().getName());
				userinfo.setUsername("abcdefg");
				Thread.sleep(2000);
				System.out.println("end time="+System.currentTimeMillis());
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
