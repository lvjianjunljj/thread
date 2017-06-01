package thread4.service;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service05 {
	private Lock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
			condition.await(1,TimeUnit.SECONDS);
			System.out.println("end awaitA time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void awaitB() {
		try {
			lock.lock();
			System.out.println("begin awaitB time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
			condition.await();
			System.out.println("end awaitB time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signalAll(){
		lock.lock();
		System.out.println("begin signalAll time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		condition.signalAll();
		lock.unlock();
	}
}
