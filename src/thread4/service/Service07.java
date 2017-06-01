package thread4.service;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service07 {
	private ReentrantLock lock = new ReentrantLock();
	private Condition conditionS = lock.newCondition();
	private Condition conditionG = lock.newCondition();
	private boolean hasValue = false;
	public void set(){
		try {
			lock.lock();
			while(hasValue == true){
				conditionS.await();
			}
			System.out.println("println set");
			hasValue = true;
			conditionG.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	public void get(){
		try {
			lock.lock();
			while(hasValue == false){
				conditionG.await();
			}
			System.out.println("println get");
			hasValue = false;
			conditionS.signal();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
