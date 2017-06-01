package thread4.service;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Service13 {
	private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
	public void read() {
		try {
			lock.readLock().lock();
			System.out.println("获得读锁 "+Thread.currentThread().getName()+" time is "+System.currentTimeMillis());
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.readLock().unlock();
		}
	}
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
