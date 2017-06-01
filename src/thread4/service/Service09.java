package thread4.service;

import java.util.concurrent.locks.ReentrantLock;

public class Service09 {
	private ReentrantLock lock;
	public Service09(boolean isFair) {
		super();
		lock = new ReentrantLock(isFair);
	}
	public void method(){
		lock.lock();
		System.out.println("ThreadName="+Thread.currentThread());
		lock.unlock();
	}
}
