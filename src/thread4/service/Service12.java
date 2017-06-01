package thread4.service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service12 {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void write() {
		try {
			lock.writeLock().lock();
			System.out.println("获得写锁 "+Thread.currentThread().getName()+" time is "+System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.writeLock().unlock();
		}
	}
}
