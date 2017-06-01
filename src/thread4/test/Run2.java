package thread4.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Run2 {
	/*使用Condition实现顺序执行*/
	volatile private static int nextPrint = 1;
	private static ReentrantLock lock = new ReentrantLock();
	final private static Condition conditionA = lock.newCondition();
	final private static Condition conditionB = lock.newCondition();
	final private static Condition conditionC = lock.newCondition();
	public static void main(String[] args) {
		Thread t1 = new Thread(){
			public void run() {
				try {
					lock.lock();
					while(nextPrint != 1){
						conditionA.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("threadA"+(i+1));
					}
					nextPrint = 2;
					conditionB.signalAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				
			};
		};
		
		Thread t2 = new Thread(){
			public void run() {
				try {
					lock.lock();
					while(nextPrint != 2){
						conditionB.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("threadB"+(i+1));
					}
					nextPrint = 3;
					conditionC.signalAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				
			};
		};
		
		Thread t3 = new Thread(){
			public void run() {
				try {
					lock.lock();
					while(nextPrint != 3){
						conditionC.await();
					}
					for (int i = 0; i < 3; i++) {
						System.out.println("threadC"+(i+1));
					}
					nextPrint = 1;
					conditionA.signalAll();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}finally{
					lock.unlock();
				}
				
			};
		};
		
		Thread[] a = new Thread[5];
		Thread[] b = new Thread[5];
		Thread[] c = new Thread[5];
		for (int i = 0; i < 5; i++) {
			a[i] = new Thread(t1);
			b[i] = new Thread(t2);
			c[i] = new Thread(t3);
			c[i].start();
			b[i].start();
			a[i].start();
		}
	}
}
