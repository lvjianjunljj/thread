package thread1.test;

import thread1.com.mythread.www.MyObject1;
import thread1.com.mythread.www.Myrunnable1;
import thread1.com.mythread.www.Mythread1;
import thread1.com.mythread.www.Mythread2;
import thread1.com.mythread.www.Mythread3;
import thread1.com.mythread.www.Mythread4;
import thread1.com.mythread.www.Mythread5;
import thread1.com.mythread.www.Mythread6;
import thread1.com.mythread.www.Mythread7;
import thread1.com.mythread.www.Mythread8;
import thread1.com.mythread.www.Mythread9;
import thread1.com.mythread.www.Mythreada;
import thread1.com.mythread.www.Mythreadb;
import thread1.com.mythread.www.Mythreadc;
import thread1.com.mythread.www.Mythreadd;
import thread1.com.mythread.www.Mythreade;
import thread1.com.mythread.www.Mythreadf1;
import thread1.com.mythread.www.Mythreadf2;
import thread1.com.mythread.www.Mythreadg1;
import thread1.com.mythread.www.Mythreadh1;
import thread1.com.mythread.www.Mythreadh2;
import thread1.com.mythread.www.Mythreadi;
import thread1.com.mythread.www.Mythreadj;
import thread1.com.mythread.www.SynchronizedObject;

public class Run {

	public static void main(String[] args) throws InterruptedException {
		/*线程的调用时随机的
		Mythread1 mythread = new Mythread();
		//mythread.run();
		mythread.start();
		System.out.println("运行结束");
		*/
		
		/*使用实现Runnable接口的方式来实现多线程技术
		Runnable runnable = new Myrunnable1();
		Thread thread = new Thread(runnable);
		thread.start();
		System.out.println("运行结束！！！");
		*/
		
		/*不共享数据运行
		Mythread2 a = new Mythread2("A");
		Mythread2 b = new Mythread2("B");
		Mythread2 c = new Mythread2("C");
		a.start();
		b.start();
		c.start();
		*/

		/*共享数据：有一个循环，运行结果是不营地是abcde都执行一次递减（有可能某一个执行两次，某一个不执行）
		 * 注意：如果Mythread2中没有super run()的话，这里就是同步进行，不是以多线程异步方式运行
		Mythread2 mythread = new Mythread2();
		Thread a = new Thread(mythread,"A");
		Thread b = new Thread(mythread,"B");
		Thread c = new Thread(mythread,"C");
		Thread d = new Thread(mythread,"D");
		Thread e = new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		*/

		/*共享数据：没有循环，abced每一个执行一次递减（但有可能出现两个对象同时对count进行处理——“非线程安全”问题）
		Mythread3 mythread = new Mythread3();
		Thread a = new Thread(mythread,"A");
		Thread b = new Thread(mythread,"B");
		Thread c = new Thread(mythread,"C");
		Thread d = new Thread(mythread,"D");
		Thread e = new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		*/
		
		/*通过锁的方法解决“非线程安全问题”
		Mythread4 mythread = new Mythread4();
		Thread a = new Thread(mythread,"A");
		Thread b = new Thread(mythread,"B");
		Thread c = new Thread(mythread,"C");
		Thread d = new Thread(mythread,"D");
		Thread e = new Thread(mythread,"E");
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		*/
		
		/*currentThread()方法可返回代码段被哪个线程调用的信息——以构造参数传入才能看出this和current的区别
		Mythread5 mythread = new Mythread5();
		mythread.start();
		*/
		
		/*方法isAlive()的功能时判断当前的线程是否处于活动状态,"end="+mythread.isAlive()打印出来的值不确定
		Mythread6 mythread = new Mythread6();
		System.out.println("begin="+mythread.isAlive());
		mythread.start();
		//Thread.sleep(1000);
		System.out.println("end="+mythread.isAlive());
		*/
		
		/*
		Mythread7 mythread = new Mythread7();
		System.out.println("begin  time="+System.currentTimeMillis());
		//用start方法是异步执行，肯定先执行两个system.out.println，不会出现预想的效果
		mythread.start();
//		mythread.run();
		System.out.println("end time="+System.currentTimeMillis());
		*/
		
		/*
		Mythread8 thread = new Mythread8();
		thread.start();
		Thread.sleep(1000);
		//这样不是终止当前线程
		//thread.interrupt();
		//这样才是终止当前线程
		Thread.currentThread().interrupt();
		//这里的Thread也可以写成thread，结果是一样的
		System.out.println("是否停止1？="+Thread.interrupted());
		System.out.println("是否停止2？="+Thread.interrupted());
		*/
		
		/*这一段代码的运行结果应该是输出两个true才对。我并不明白为什么结果是两个false,线程并没有停止。
		 * sleep的时常要比线程运行时间短，不然当运行System.out.println(***)时线程已经结束，状态不是停止，isInterrupted的返回值就是false
		Mythread8 thread = new Mythread8();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		//Thread.currentThread().interrupt();
		System.out.println("是否停止3？="+thread.isInterrupted());
		System.out.println("是否停止4？="+thread.isInterrupted());
		System.out.println("end!!!");
		*/
		
		/*
		Mythread9 thread = new Mythread9();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		//Thread.currentThread().interrupt();
		System.out.println("end!!!");
		*/
		
		/*
		Mythreada thread = new Mythreada();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		//Thread.currentThread().interrupt();
		System.out.println("end!!!");
		*/
		
		/*
		Mythreadb thread = new Mythreadb();
		thread.start();
		Thread.sleep(1000);
		thread.interrupt();
		//Thread.currentThread().interrupt();
		System.out.println("end!!!");
		*/
		
		/*测试线程在沉睡中停止
		 * 如果在sleep状态下停止某一线程，会进入catch语句，并且清除停止状态值，是指变成false
		Mythreadc thread = new Mythreadc();
		thread.start();
		Thread.sleep(2000);
		thread.interrupt();
		*/
		
		/*
		Mythreadd thread = new Mythreadd();
		thread.start();
		thread.interrupt();
		System.out.println("end!!!");
		*/
		
		/*将方法interrupt()与return结合使用也能实现停止线程的效果,不过还是建议使用“抛异常”的方法来实现线程的停止
		Mythreade thread = new Mythreade();
		thread.start();
		Thread.sleep(200);
		thread.interrupt();
		*/
		
		/*在使用suspend与resume方法时，如果使用不当，容易造成公共的同步对象独占，使得其他线程无法访问公共同步对象
		final SynchronizedObject object = new SynchronizedObject();
		Thread thread1 = new Thread(){
			@Override
			public void run() {
				object.printString();
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(1000);
		
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				System.out.println("thread2启动了，但是进入不了printString()方法！只打印出一个begin和end！");
				System.out.println("因为pringString()方法被a线程锁定并永远暂停了");
			}
		};
		thread2.start();
		*/
		
		/*因为线程的暂停而导致数据不同步的情况
		final MyObject1 object = new MyObject1();
		Thread thread1 = new Thread(){
			public void run() {
				object.setValue("a", "aa");
			}
		};
		thread1.setName("a");
		thread1.start();
		Thread.sleep(1000);
		Thread thread2 = new Thread(){
			@Override
			public void run() {
				object.print();
			}
		};
		thread2.start();
		*/
		
		/*yieId()方法的作用是放弃当前CPU资源，将其让给其他的任务去占领CPU执行时间
		Mythreadf1 thread1 = new Mythreadf1();
		thread1.start();
		Mythreadf2 thread2 = new Mythreadf2();
		thread2.start();
		*/
		
		/*通过比较Thread.currentThread().setPriority(6);是否运行测试优先级的继承性
		System.out.println("main thread beforesetPriority priority is "+Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(6);
		System.out.println("main thread aftersetPriority priority is "+Thread.currentThread().getPriority());
		Mythreadg1 thread = new Mythreadg1();
		thread.start();
		*/
		
		/*测试优先级的规则性，验证了线程的优先级与代码执行顺序无关
		for(int i=0;i<5;i++){
			Mythreadh1 thread1 = new Mythreadh1();
			thread1.setPriority(1);
			thread1.start();
			Mythreadh2 thread2 = new Mythreadh2();
			thread2.setPriority(10);
			thread2.start();
		}
		*/
		
		/*测试优先级的随机性
		for(int i=0;i<5;i++){
			Mythreadh1 thread1 = new Mythreadh1();
			thread1.setPriority(5);
			thread1.start();
			Mythreadh2 thread2 = new Mythreadh2();
			thread2.setPriority(6);
			thread2.start();
		}
		*/
		
		/*财务室优先级搞得线程运行速度快
		Mythreadi thread1 = new Mythreadi();
		Mythreadi thread2 = new Mythreadi();
		thread1.setPriority(1);
		thread2.setPriority(10);
		thread1.start();
		thread2.start();
		Thread.sleep(2000);
		//不执行stop方法的话这两个线程就会一直运行下去
		thread1.stop();
		thread2.stop();
		System.out.println("count of thread1 is "+thread1.getCount());
		System.out.println("count of thread2 is "+thread2.getCount());		
		*/
		
		/*测试守护线程
		Mythreadj thread = new Mythreadj();
		//如果没有这句话将一直打印下去（这里我不是特别明白守护线程的工作机制）
		thread.setDaemon(true);
		thread.start();
		Thread.sleep(5000);
		System.out.println("我离开thread对象也不打印了，也就停止了！！！");
		*/
	}
}
