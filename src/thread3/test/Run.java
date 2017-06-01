package thread3.test;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.util.Date;

import thread3.com.mythread.www.Mythread01;
import thread3.com.mythread.www.Mythread02;
import thread3.com.mythread.www.Mythread03;
import thread3.com.mythread.www.Mythread04;
import thread3.com.mythread.www.Mythread05;
import thread3.com.mythread.www.Mythread06;
import thread3.com.mythread.www.Mythread07;
import thread3.com.mythread.www.Mythread08;
import thread3.com.mythread.www.Mythread09;
import thread3.com.mythread.www.Mythread10;
import thread3.com.mythread.www.Mythread11;
import thread3.com.mythread.www.Mythread12;
import thread3.com.mythread.www.Mythread13;
import thread3.com.mythread.www.Mythread14;
import thread3.com.mythread.www.Mythread15;
import thread3.com.mythread.www.Mythread16;
import thread3.com.mythread.www.Mythread17;
import thread3.com.mythread.www.Mythread18;
import thread3.com.mythread.www.Mythread19;
import thread3.com.mythread.www.Mythread20;
import thread3.com.mythread.www.Mythread21;
import thread3.com.mythread.www.Mythread22;
import thread3.com.mythread.www.Mythread23;
import thread3.com.mythread.www.Mythread24;
import thread3.com.mythread.www.Mythread25;
import thread3.com.mythread.www.Mythread26;
import thread3.com.mythread.www.Mythread27;
import thread3.com.mythread.www.Mythread28;
import thread3.com.mythread.www.Mythread29;
import thread3.com.mythread.www.Mythread30;
import thread3.com.mythread.www.Mythread31;
import thread3.com.mythread.www.Mythread32;
import thread3.com.mythread.www.Mythread33;
import thread3.com.mythread.www.Mythread34;
import thread3.com.mythread.www.Mythread35;
import thread3.com.mythread.www.Mythread36;
import thread3.service.Add;
import thread3.service.Customer1;
import thread3.service.Customer2;
import thread3.service.Customer3;
import thread3.service.DBTools;
import thread3.service.Mylist1;
import thread3.service.Mystack1;
import thread3.service.Producter1;
import thread3.service.Producter2;
import thread3.service.Productor3;
import thread3.service.ReadData;
import thread3.service.ReadData1;
import thread3.service.Subtract;
import thread3.service.Subtract2;
import thread3.service.ThreadLocalExt1;
import thread3.service.Tools1;
import thread3.service.Tools2;
import thread3.service.Tools3;
import thread3.service.Tools4;
import thread3.service.WriteData;
import thread3.service.WriteData1;

public class Run {
	public static ThreadLocalExt1 t1 = new ThreadLocalExt1();
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		/*通过while语句轮询机制来检测某一个条件实现两个线程间通信
		Mylist1 list = new Mylist1();
		Mythread01 thread1  = new Mythread01(list);
		thread1.setName("A");
		Mythread02 thread2 = new Mythread02(list);
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*没有“对象监视器”（即没有同步枷锁）的情况下调用wait方法会出现异常
		String newstring = new String();
		newstring.wait();
		*/
		
		/*wait方法下面的代码将不会再被执行
		String lock = new String();
		System.out.println("syn上面");
		synchronized (lock) {
			System.out.println("syn第一行");
			lock.wait();
			System.out.println("wait下面");
		}
		System.out.println("syn下面");
		*/
		
		/*使用notify()方法使wait状态的线程继续运行
		 * 注意运行两个方法时都要持有锁
		Object lock = new Object();
		Mythread03 thread1 = new Mythread03(lock);
		thread1.start();
		Mythread04 thread2 = new Mythread04(lock);
		Thread.sleep(2000);
		thread2.start();
		*/
		
		/*使用wait和notify方法实现第一个示例中的功能
		 * wait end最后才输出说明notify()方法执行后并不立即释放锁，而是等线程运行完毕后才释放锁
		Object lock = new Object();
		Mythread05 thread1 = new Mythread05(lock);
		thread1.start();
		Thread.sleep(50);
		Mythread06 thread2 = new Mythread06(lock);
		thread2.start();
		*/
		
		/*调用notify()方法一次只能随机通知一个线程进行唤醒，当多次调用notify()方法时，会随机将等待wait状态的线程进行唤醒
		Object lock = new Object();
		Mythread07 t1 =new Mythread07(lock);
		Mythread07 t2 =new Mythread07(lock);
		Mythread07 t3 =new Mythread07(lock);
		Mythread08 t4 =new Mythread08(lock);
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(50);
		//注意：同一个Thread不能重复调用start方法，所以这里不能连续写t4.start();而是要在Mythread08的润方法中将要执行的语句进行重复书写
		t4.start();
		*/
		
		/*使用notifyAll()方法唤醒全部线程
		Object lock = new Object();
		Mythread07 t1 =new Mythread07(lock);
		Mythread07 t2 =new Mythread07(lock);
		Mythread07 t3 =new Mythread07(lock);
		Mythread09 t4 =new Mythread09(lock);
		t1.start();
		t2.start();
		t3.start();
		Thread.sleep(50);
		t4.start();
		*/
		
		/*在使用wait/notify模式时，还需要注意另外一种情况，也就是wait等待的条件发生了变化，也容易造成程序逻辑的混乱
		 * 出现异常的原因是来个实现删除操作的remove()操作 的线程都执行了wait方法，当线程在两秒后被运行第二个减操作的线程则出现索引溢出的异常
		String lock = new String("");
		Add add = new Add(lock);
		Subtract sub = new Subtract(lock);
		Mythread10 add1 = new Mythread10(add);
		add1.setName("add1");
		Mythread11 sub1 = new Mythread11(sub);
		sub1.setName("sub1");
		Mythread11 sub2 = new Mythread11(sub);
		sub2.setName("sub2");
		sub1.start();
		sub2.start();
		Thread.sleep(2000);
		add1.start();
		*/
		
		/*更改subtract方法可以解决这个问题
		 * 虽然没有抛出异常，但实际上线程sub1进入了wait状态
		String lock = new String("");
		Add add = new Add(lock);
		Subtract2 sub = new Subtract2(lock);
		Mythread10 add1 = new Mythread10(add);
		add1.setName("add1");
		Mythread12 sub1 = new Mythread12(sub);
		sub1.setName("sub1");
		Mythread12 sub2 = new Mythread12(sub);
		sub2.setName("sub2");
		sub1.start();
		sub2.start();
		Thread.sleep(2000);
		add1.start();
		*/
		
		/*一生产与一消费：操作值——一个生产者与一个消费者进行数据交互
		String lock = "";
		Producter1 p = new Producter1(lock);
		Customer1 c = new Customer1(lock);
		Mythread13 threadp = new Mythread13(p);
		Mythread14 threadc = new Mythread14(c);
		threadp.start();
		threadc.start();
		*/
		
		/*多生产者与消费者：操作值-假死
		 * 出现问题是因为notify唤起的是同类，但是这里并不会出现这样的问题，所以我感觉非常奇怪~~~~~~~~~~~~~~~~~~~~~~~
		 * 其实将Producter2与Customer2中的notify方法改为notifyAll方法就可以解决这个问题
		String lock = "";
		Producter2 p = new Producter2(lock);
		Customer2 c = new Customer2(lock);
		Mythread15[] threadp = new Mythread15[2];
		Mythread16[] threadc = new Mythread16[2];
		for (int i = 0; i < 2; i++) {
			threadp[i] = new Mythread15(p);
			threadp[i].setName("productor"+(i+1));
			threadc[i] = new Mythread16(c);
			threadc[i].setName("customer"+(i+1));
			threadp[i].start();
			threadc[i].start();
		}
		Thread.sleep(5000);
		Thread[] threadArray = new Thread[Thread.currentThread().getThreadGroup().activeCount()];
		Thread.currentThread().getThreadGroup().enumerate(threadArray);
		for (int i = 0; i < threadArray.length; i++) {
			System.out.println(threadArray[i].getName()+"_"+threadArray[i].getState());
		}
		*/
		
		/*一生产与一消费——操作栈
		 * 使生产者向堆栈list对象中放入数据，消费者从list堆栈中取出数据
		Mystack1 stack = new Mystack1();
		Mythread17 thread1 = new Mythread17(stack);
		Mythread18 thread2 = new Mythread18(stack);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*一生产与多消费
		 * 会出现索引溢出的异常——解决方法当然是将Mystack1中的if变为while
		 * 将if变为while的话会出现“假死”的情况——解决方法是将Mystack1中的notify变为notifyAll
		Mystack1 stack = new Mystack1();
		Productor3 p = new Productor3(stack);
		Customer3 c1 = new Customer3(stack);
		Customer3 c2 = new Customer3(stack);
		Customer3 c3 = new Customer3(stack);
		Customer3 c4 = new Customer3(stack);
		Customer3 c5 = new Customer3(stack);
		Mythread19 thread1 = new Mythread19(p);
		Mythread20 thread2 = new Mythread20(c1);
		Mythread20 thread3 = new Mythread20(c1);
		Mythread20 thread4 = new Mythread20(c1);
		Mythread20 thread5 = new Mythread20(c1);
		Mythread20 thread6 = new Mythread20(c1);
		thread1.setName("A");
		thread2.setName("B1");
		thread3.setName("B2");
		thread4.setName("B3");
		thread5.setName("B4");
		thread6.setName("B5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		*/
		
		/*多生产与一消费
		Mystack1 stack = new Mystack1();
		Productor3 p1 = new Productor3(stack);
		Productor3 p2 = new Productor3(stack);
		Productor3 p3 = new Productor3(stack);
		Productor3 p4 = new Productor3(stack);
		Productor3 p5 = new Productor3(stack);
		Customer3 c = new Customer3(stack);
		Mythread19 thread1 = new Mythread19(p1);
		Mythread19 thread2 = new Mythread19(p2);
		Mythread19 thread3 = new Mythread19(p3);
		Mythread19 thread4 = new Mythread19(p4);
		Mythread19 thread5 = new Mythread19(p5);
		Mythread20 thread6 = new Mythread20(c);
		thread1.setName("A1");
		thread2.setName("A2");
		thread3.setName("A3");
		thread4.setName("A4");
		thread5.setName("A5");
		thread6.setName("B");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		*/
		
		/*多生产与多消费
		Mystack1 stack = new Mystack1();
		Productor3 p1 = new Productor3(stack);
		Productor3 p2 = new Productor3(stack);
		Productor3 p3 = new Productor3(stack);
		Productor3 p4 = new Productor3(stack);
		Productor3 p5 = new Productor3(stack);
		Customer3 c1 = new Customer3(stack);
		Customer3 c2 = new Customer3(stack);
		Customer3 c3 = new Customer3(stack);
		Customer3 c4 = new Customer3(stack);
		Customer3 c5 = new Customer3(stack);
		Mythread19 thread1 = new Mythread19(p1);
		Mythread19 thread2 = new Mythread19(p2);
		Mythread19 thread3 = new Mythread19(p3);
		Mythread19 thread4 = new Mythread19(p4);
		Mythread19 thread5 = new Mythread19(p5);
		Mythread20 thread6 = new Mythread20(c1);
		Mythread20 thread7 = new Mythread20(c2);
		Mythread20 thread8 = new Mythread20(c3);
		Mythread20 thread9 = new Mythread20(c4);
		Mythread20 thread0 = new Mythread20(c5);
		thread1.setName("A1");
		thread2.setName("A2");
		thread3.setName("A3");
		thread4.setName("A4");
		thread5.setName("A5");
		thread6.setName("B1");
		thread7.setName("B2");
		thread8.setName("B3");
		thread9.setName("B4");
		thread0.setName("B5");
		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
		thread6.start();
		thread7.start();
		thread8.start();
		thread9.start();
		thread0.start();
		*/
		
		/*用PipedInputStream和PipedOutputStream进行线程间通信——字节流
		 * 这里先read或者先write结果都是一样的，若是读取线程先启动，由于当时没有数据被写入，所以线程会阻塞在int readLength = input.read(byteArray);直到有数据写入才继续进行下去
		 * 这里会抛出一个异常Write end dead，不知道为什么
		WriteData write = new WriteData();
		ReadData read = new ReadData();
		PipedOutputStream out = new PipedOutputStream();
		PipedInputStream input = new PipedInputStream();
		Mythread21 thread1 = new Mythread21(write, out);
		Mythread22 thread2 = new Mythread22(read, input);
		//这两句话效果一样，是为了使两个stream之间产生通信链接，这样才可以将数据进行输入与输出。
//		out.connect(input);
		input.connect(out);
		thread1.start();
		Thread.sleep(2000);
		thread2.start();
		*/
		
		/*用PipedWriter和PipedReader进行线程间通信——字节流
		 * 和用PipedInputStream和PipedOutputStream进行线程间通信（字节流）效果及原理类似，只是不需要将字符集转换成字节集
		WriteData1 write = new WriteData1();
		ReadData1 read = new ReadData1();
		PipedWriter out = new PipedWriter();
		PipedReader input = new PipedReader();
		Mythread23 thread1 = new Mythread23(write, out);
		Mythread24 thread2 = new Mythread24(read, input);
//		out.connect(input);
		input.connect(out);
		thread1.start();
		Thread.sleep(2000);
		thread2.start();
		*/
		
		/*实战：等待/通知之交叉备份
		 * 交替打印的原理就是使用了代码volatile private boolean mark = false;
		DBTools backup = new DBTools();
		for (int i = 0; i < 20; i++) {
			Mythread25 thread1 = new Mythread25(backup);
			Mythread26 thread2 = new Mythread26(backup);
			thread1.start();
			thread2.start();
		}
		*/
		
		/*方法join的使用
		 * 如果子线程中要进行大量的耗时运算，主线程往往将早于子线程结束之前结束。这时如果主线程想等待子线程执行完成之后再结束，就要用到join方法了
		Mythread27 thread = new Mythread27();
		thread.start();
		thread.join();
		System.out.println("我想要当thread执行完后再执行！！！");
		*/
		
		/*方法join(long)中的参数是设定等待时间（时间过后主线程会继续运行，不管子线程是否运行完毕）
		 * 在这里join和sleep两个方法所实现的功能是一样的
		Mythread28 thread = new Mythread28();
		thread.start();
		Thread.sleep(2000);
//		thread.join(2000);
		System.out.println("end time="+System.currentTimeMillis());
		*/
		
		/*方法join(long)和sleep(long)是有所不同的，
		 * Thread.sleep不释放锁
		 * 方法join(long)的功能是在内部使用wait(long)方法来实现的，所以join(long)方法具有释放锁的特点
		 * 改动：将Mythread29中的Thread.sleep(6000);改为thread.join(6000);，就可以先打印print bService time=xxx
		Mythread30 thread2 = new Mythread30();
		Mythread29 thread1 = new Mythread29(thread2);
		thread1.start();
		Thread.sleep(1000);
		Mythread31 thread3 = new Mythread31(thread2);
		thread3.start();
		*/
		
		/*验证线程变量的隔离性
		 * 虽然3个线程都向t1对象中set()数据值，但是每个线程还是能取出自己的数据
		Mythread32 thread1 = new Mythread32();
		Mythread33 thread2 = new Mythread33();
		thread1.start();
		thread2.start();
		for (int i = 0; i < 100; i++) {
			Tools1.t1.set("Main"+(i+1));
			System.out.println("Main getValue="+Tools1.t1.get());
			Thread.sleep(200);
		}
		*/
		
		/*
		if(t1.get() == null){
			System.out.println("未放值");
			t1.set("我的值");
		}
		System.out.println(t1.get());
		System.out.println(t1.get());
		*/
		
		/*再次验证线程变量的隔离性——子线程和父线程各有各自所拥有的默认值
		Mythread34 thread = new Mythread34();
		for (int i = 0; i < 10; i++) {
			System.out.println("在线程Main中的值="+Tools2.t1.get());
			Thread.sleep(200);
		}
		thread.start();
		*/
		
		/*使用类InheritableThreadLocal可以在子线程中去的父线程继承下来的值
		for (int i = 0; i < 10; i++) {
			System.out.println("Main value="+Tools3.t1.get());
			Thread.sleep(200);
		}
		Mythread35 thread = new Mythread35();
		thread.start();
		*/
		
		/*通过重写类InheritableThreadLocal中的childValue(Object parentValue)方法，可以实现在继承的同时对值进行进一步的处理
		for (int i = 0; i < 10; i++) {
			System.out.println("Main value="+Tools4.t1.get());
			Thread.sleep(200);
		}
		Mythread36 thread = new Mythread36();
		thread.start();
		Thread.sleep(1000);
		System.out.println("Main value="+Tools4.t1.get());
		*/
		
		
		
		
		
		
		
	}
}
