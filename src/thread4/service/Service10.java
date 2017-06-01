package thread4.service;

import java.util.Calendar;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Service10 {
	private ReentrantLock lock = new ReentrantLock();
	private Condition condition = lock.newCondition();
	
	public void waitMethod(){
		try {
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 5);
			lock.lock();
			System.out.println("await begin time is "+System.currentTimeMillis());
			condition.awaitUntil(calendarRef.getTime());
			System.out.println("await end time is "+System.currentTimeMillis());
		} catch (InterruptedException e) {
			e.printStackTrace();
		}finally{
			lock.unlock();
		}
	}
	
	public void notifyMethod(){
			Calendar calendarRef = Calendar.getInstance();
			calendarRef.add(Calendar.SECOND, 5);
			lock.lock();
			System.out.println("signal begin time is "+System.currentTimeMillis());
			condition.signal();
			System.out.println("signal end time is "+System.currentTimeMillis());
			lock.unlock();
	}
}
