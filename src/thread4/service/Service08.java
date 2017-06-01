package thread4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service08 {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	private boolean hasValue = false;
	public void set(){
		try {
			lock.lock();
			while(hasValue == true){
				System.out.println("maybe continuously println set");
				condition.await();
			}
			System.out.println("println set");
			hasValue = true;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void get(){
		try {
			lock.lock();
			while(hasValue == false){
				System.out.println("maybe continuously println get");
				condition.await();
			}
			System.out.println("println get");
			hasValue = false;
			condition.signalAll();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
