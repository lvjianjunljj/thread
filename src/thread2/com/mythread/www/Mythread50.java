package thread2.com.mythread.www;

import thread2.service.Servicee;

public class Mythread50 implements Runnable{
	public String username;
	public Object lock1 = new Object();
	public Object lock2 = new Object();
	public void setFlag(String username){
		this.username = username;
	}
	@Override
	public void run() {
		if(username=="a"){
			synchronized (lock1) {
				try {
					System.out.println("username="+username);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock2) {
					System.out.println("代码执行顺序：lock1->lock2");
				}
			}
		}
		if(username=="b"){
			synchronized (lock2) {
				try {
					System.out.println("username="+username);
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (lock1) {
					System.out.println("代码执行顺序：lock2->lock1");
				}
			}
		}
	}
}
