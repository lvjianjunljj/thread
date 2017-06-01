package thread4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service04 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void await() {
		try {
			lock.lock();
			System.out.println("await time is "+System.currentTimeMillis());
			condition.await();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signal(){
		lock.lock();
		System.out.println("signal time is "+System.currentTimeMillis());
		condition.signal();
		lock.unlock();
	}
}
