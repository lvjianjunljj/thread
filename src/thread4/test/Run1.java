package thread4.test;

import thread4.com.mythread.www.Mythread01;
import thread4.com.mythread.www.Mythread02;
import thread4.com.mythread.www.Mythread03;
import thread4.com.mythread.www.Mythread04;
import thread4.com.mythread.www.Mythread05;
import thread4.com.mythread.www.Mythread06;
import thread4.com.mythread.www.Mythread07;
import thread4.com.mythread.www.Mythread08;
import thread4.com.mythread.www.Mythread09;
import thread4.com.mythread.www.Mythread10;
import thread4.com.mythread.www.Mythread11;
import thread4.com.mythread.www.Mythread12;
import thread4.com.mythread.www.Mythread13;
import thread4.com.mythread.www.Mythread14;
import thread4.com.mythread.www.Mythread15;
import thread4.com.mythread.www.Mythread16;
import thread4.com.mythread.www.Mythread17;
import thread4.com.mythread.www.Mythread18;
import thread4.com.mythread.www.Mythread19;
import thread4.com.mythread.www.Mythread20;
import thread4.com.mythread.www.Mythread21;
import thread4.service.Service01;
import thread4.service.Service02;
import thread4.service.Service03;
import thread4.service.Service04;
import thread4.service.Service05;
import thread4.service.Service06;
import thread4.service.Service07;
import thread4.service.Service08;
import thread4.service.Service09;
import thread4.service.Service10;
import thread4.service.Service11;
import thread4.service.Service12;
import thread4.service.Service13;

public class Run1 {
	public static void main(String[] args) throws InterruptedException {
		
		/*使用ReentrantLock实现同步
		 * 调用ReentrantLock对象的lock()方法获取锁，调用unlock()方法释放锁
		Service01 service = new Service01();
		Mythread01 thread1 = new Mythread01(service);
		Mythread01 thread2 = new Mythread01(service);
		Mythread01 thread3 = new Mythread01(service);
		Mythread01 thread4 = new Mythread01(service);
		Mythread01 thread5 = new Mythread01(service);
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		*/
		
		/*调用lock.lock()代码的线程就持有了“对象监视器”，其他线程只有等待锁被释放时再次争抢。
		 * 效果和使用synchronized关键字一样，线程之间还是顺序执行。
		Service02 service = new Service02();
		Mythread02 thread1 = new Mythread02(service);
		thread1.setName("A");
		Mythread03 thread2 = new Mythread03(service);
		thread2.setName("AA");
		Mythread04 thread3 = new Mythread04(service);
		thread3.setName("B");
		Mythread05 thread4 = new Mythread05(service);
		thread4.setName("BB");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		*/
		
		/*必须要在调用之前调用lock.lock()代码获得同步监视器才行，不然会抛出异常
		 * condition.await()方法可以实现线程的等待功能，使线程进入waiting状态
		Service03 service = new Service03();
		Mythread06 thread = new Mythread06(service);
		thread.start();
		*/
		
		/*正确使用Condition实现等待/通知
		Service04 service = new Service04();
		Mythread07 thread = new Mythread07(service);
		thread.start();
		Thread.sleep(2000);
		service.signal();
		*/
		
		/*使用多个Condition事项通知全部等待线程
		Service05 service = new Service05();
		Mythread08 thread1 = new Mythread08(service);
		Mythread09 thread2 = new Mythread09(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		Thread.sleep(4000);
		service.signalAll();
		*/
		
		/*使用多个Condition事项通知部分线程
		 * 如果想要单独唤醒部分线程，就有必要使用多个Condition对象了，也就是Condition对象可以唤醒部分指定线程，助于提升程序运行效率。
		 * 可以先对线程进行分组，然后再唤醒指定组中的线程
		Service06 service = new Service06();
		Mythread10 thread1 = new Mythread10(service);
		Mythread11 thread2 = new Mythread11(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		service.signalAll_A();
		*/
		
		/*实现生产者/消费者模式——一对一交替打印
		Service07 service = new Service07();
		Mythread12 thread1 = new Mythread12(service);
		Mythread13 thread2 = new Mythread13(service);
		thread1.start();
		thread2.start();
		*/
		
		/*实现生产者/消费者模式——多对多交替打印
		 * maybe continuously println set和maybe continuously println get的出现是因为signalAll方法唤起了同类
		 * 这里的问题可以用signalAll()方法解决（同第三章），也可以用两个condition解决，不然相对于synchronized的优势没有体现
		Service08 service = new Service08();
		for (int i = 0; i < 10; i++) {
			Mythread14 thread1 = new Mythread14(service);
			Mythread15 thread2 = new Mythread15(service);
			thread1.start();
			thread2.start();
		}
		*/
		
		
		/*公平锁
		final Service09 service = new Service09(true);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("线程运行了！！ ThreadName="+Thread.currentThread());
				service.method();
			}
		};
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		*/
		
		/*非公平锁
		final Service09 service = new Service09(false);
		Runnable runnable = new Runnable() {
			
			@Override
			public void run() {
				System.out.println("线程运行了！！ ThreadName="+Thread.currentThread());
				service.method();
			}
		};
		Thread[] threads = new Thread[10];
		for (int i = 0; i < 10; i++) {
			threads[i] = new Thread(runnable);
		}
		for (int i = 0; i < 10; i++) {
			threads[i].start();
		}
		*/
		
		/*方法awaitUnitil()的使用。
		 * 个人感觉与await(Long time,TimeUnit unit)方法类似，只是其中参数不同
		 * awaitUnitil()的参数是自动唤醒的系统时间
		Service10 service = new Service10();
		Mythread16 thread1 = new Mythread16(service);
		Mythread17 thread2 = new Mythread17(service);
		thread1.start();
		Thread.sleep(2000);
		*/
		
		/*类ReentrantReadWriteLock的使用
		 * 读读共享
		 * 两个线程几乎同时进入lock()后面的代码
		Service11 service = new Service11();
		Mythread18 thread1 = new Mythread18(service);
		Mythread18 thread2 = new Mythread18(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*写写互斥
		Service12 service = new Service12();
		Mythread19 thread1 = new Mythread19(service);
		Mythread19 thread2 = new Mythread19(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*读写互斥（写读互斥类似）
		Service13 service = new Service13();
		Mythread20 thread1 = new Mythread20(service);
		Mythread21 thread2 = new Mythread21(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		
		
		
	}
}
