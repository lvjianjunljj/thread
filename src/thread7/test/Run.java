package thread7.test;

import thread7.com.mythread.www.Mythread01;
import thread7.com.mythread.www.Mythread02;
import thread7.com.mythread.www.Mythread03;
import thread7.com.mythread.www.Mythread04;

public class Run {
	public static void main(String[] args) throws InterruptedException {
		/*线程对象在不同的运行时期有不同的状态，状态信息就存在于State枚举类中
		Mythread01 thread = new Mythread01();
		System.out.println("main方法中start执行前的状态："+thread.getState());
		Thread.sleep(1000);
		thread.start();
		Thread.sleep(1000);
		System.out.println("main方法中start执行后的状态："+thread.getState());
		*/
		
		/*线程状态TIMED_WAITING代表线程执行了Thread.sleep()方法，呈等待状态，等待时间到达，继续向下运行
		Mythread02 thread = new Mythread02();
		thread.start();
		Thread.sleep(1000);
		System.out.println("线程状态"+thread.getState());
		*/
		
		/*线程对象关联线程组：1级关联
		Mythread03 thread1 = new Mythread03();
		Mythread03 thread2 = new Mythread03();
		//参数设置线程组名称
		ThreadGroup group = new ThreadGroup("我的线程组");
		Thread a = new Thread(group, thread1);
		Thread b = new Thread(group, thread2);
		a.start();
		b.start();
		System.out.println("活动的线程数："+group.activeCount());
		System.out.println("线程组的名称："+group.getName());
		*/
		
		/*线程组有自动归属特性
		//方法activeGroupCount()取得当前线程组对象中的子线程组的数量（方法activeCount()取得当前线程组对象中的子线程的数量）
		//方法enumerate是将线程组的第一个子线程组以复制的形式拷贝到groups中
		System.out.println("A处线程 "+Thread.currentThread().getName()
				+" 所属线程组名 "+Thread.currentThread().getThreadGroup().getName()
				+" 中由线程组的数量"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup group = new ThreadGroup("新的组");
		System.out.println("B处线程 "+Thread.currentThread().getName()
				+" 所属线程组名 "+Thread.currentThread().getThreadGroup().getName()
				+" 中由线程组的数量"+Thread.currentThread().getThreadGroup().activeGroupCount());
		ThreadGroup[] groups = new ThreadGroup[Thread.currentThread().getThreadGroup().activeGroupCount()];
		Thread.currentThread().getThreadGroup().enumerate(groups);
		for (int i = 0; i < groups.length; i++) {
			System.out.println("第一个线程组名称:"+groups[i].getName());
		}
		*/
		
		/*获取根线程组
		System.out.println("线程："+Thread.currentThread().getName()
				+"所在线程组名为："+Thread.currentThread().getThreadGroup().getName());
		System.out.println("线程："+Thread.currentThread().getName()
				+"所在线程组名为："+Thread.currentThread().getThreadGroup().getName()
				+"线程组所在线程组名为："+Thread.currentThread().getThreadGroup().getParent().getName());
		System.out.println("线程："+Thread.currentThread().getName()
				+"所在线程组名为："+Thread.currentThread().getThreadGroup().getName()
				+"线程组所在线程组名为："+Thread.currentThread().getThreadGroup().getName()
				+"线程组所在线程组所在线程组名为："+Thread.currentThread().getThreadGroup().getParent().getParent().getName());
		*/
		
		
		/*通过改造代码的方式是无序运行的线程具有有序性
		Object lock = new Object();
		Mythread04 a= new Mythread04(lock, "A", 1);
		Mythread04 b= new Mythread04(lock, "B", 2);
		Mythread04 c= new Mythread04(lock, "C", 0);
		a.start();
		b.start();
		c.start();
		*/
	}
}
