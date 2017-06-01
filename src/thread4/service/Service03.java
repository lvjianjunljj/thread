package thread4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service03 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void method() {
		try {
			lock.lock();
			System.out.println("AAA");
			condition.await();
			System.out.println("BBB");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
			System.out.println("锁释放了！！！");
		}
	}
	
}
