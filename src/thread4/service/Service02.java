package thread4.service;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service02 {
	private Lock lock = new ReentrantLock();
	public void methodA() {
		try {
			lock.lock();
			System.out.println("methodA begin threadName="+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("methodA end threadName="+Thread.currentThread().getName());
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void methodB() {
		try {
			lock.lock();
			System.out.println("methodB begin threadName="+Thread.currentThread().getName());
			Thread.sleep(1000);
			System.out.println("methodB end threadName="+Thread.currentThread().getName());
			lock.unlock();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
