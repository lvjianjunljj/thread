package thread4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Service06 {
	private Lock lock = new ReentrantLock();
	private Condition conditionA = lock.newCondition();
	private Condition conditionB = lock.newCondition();
	public void awaitA() {
		try {
			lock.lock();
			System.out.println("begin awaitA time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
			conditionA.await();
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
			conditionB.await();
			System.out.println("end awaitB time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	public void signalAll_A(){
		lock.lock();
		System.out.println("begin signalAll_A time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		conditionA.signalAll();
		lock.unlock();
	}
	public void signalAll_B(){
		lock.lock();
		System.out.println("begin signalAll_B time is "+System.currentTimeMillis()+" threadName is "+Thread.currentThread().getName());
		conditionB.signalAll();
		lock.unlock();
	}
}
