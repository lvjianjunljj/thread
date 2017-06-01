package thread2.test;


import thread2.com.mythread.www.Mythread01;
import thread2.com.mythread.www.Mythread02;
import thread2.com.mythread.www.Mythread03;
import thread2.com.mythread.www.Mythread04;
import thread2.com.mythread.www.Mythread05;
import thread2.com.mythread.www.Mythread06;
import thread2.com.mythread.www.Mythread07;
import thread2.com.mythread.www.Mythread08;
import thread2.com.mythread.www.Mythread09;
import thread2.com.mythread.www.Mythread10;
import thread2.com.mythread.www.Mythread11;
import thread2.com.mythread.www.Mythread12;
import thread2.com.mythread.www.Mythread13;
import thread2.com.mythread.www.Mythread14;
import thread2.com.mythread.www.Mythread15;
import thread2.com.mythread.www.Mythread16;
import thread2.com.mythread.www.Mythread17;
import thread2.com.mythread.www.Mythread18;
import thread2.com.mythread.www.Mythread19;
import thread2.com.mythread.www.Mythread20;
import thread2.com.mythread.www.Mythread21;
import thread2.com.mythread.www.Mythread22;
import thread2.com.mythread.www.Mythread23;
import thread2.com.mythread.www.Mythread24;
import thread2.com.mythread.www.Mythread25;
import thread2.com.mythread.www.Mythread26;
import thread2.com.mythread.www.Mythread27;
import thread2.com.mythread.www.Mythread28;
import thread2.com.mythread.www.Mythread29;
import thread2.com.mythread.www.Mythread30;
import thread2.com.mythread.www.Mythread31;
import thread2.com.mythread.www.Mythread32;
import thread2.com.mythread.www.Mythread33;
import thread2.com.mythread.www.Mythread34;
import thread2.com.mythread.www.Mythread35;
import thread2.com.mythread.www.Mythread36;
import thread2.com.mythread.www.Mythread37;
import thread2.com.mythread.www.Mythread38;
import thread2.com.mythread.www.Mythread39;
import thread2.com.mythread.www.Mythread40;
import thread2.com.mythread.www.Mythread41;
import thread2.com.mythread.www.Mythread42;
import thread2.com.mythread.www.Mythread43;
import thread2.com.mythread.www.Mythread44;
import thread2.com.mythread.www.Mythread45;
import thread2.com.mythread.www.Mythread46;
import thread2.com.mythread.www.Mythread47;
import thread2.com.mythread.www.Mythread48;
import thread2.com.mythread.www.Mythread49;
import thread2.com.mythread.www.Mythread50;
import thread2.com.mythread.www.Mythread51;
import thread2.com.mythread.www.Mythread52;
import thread2.com.mythread.www.Mythread53;
import thread2.com.mythread.www.Mythread54;
import thread2.com.mythread.www.Mythread55;
import thread2.com.mythread.www.Mythread56;
import thread2.com.mythread.www.Mythread57;
import thread2.com.mythread.www.Mythread58;
import thread2.com.mythread.www.Mythread59;
import thread2.service.CommonUtils;
import thread2.service.HasSelfPrivateNum1;
import thread2.service.HasSelfPrivateNum2;
import thread2.service.InnerClass;
import thread2.service.InnerClass2;
import thread2.service.MyObject1;
import thread2.service.MyObject2;
import thread2.service.MyObject3;
import thread2.service.Mylist;
import thread2.service.Mylist2;
import thread2.service.ObjectService;
import thread2.service.ObjectService2;
import thread2.service.PrintString;
import thread2.service.PrintString1;
import thread2.service.PublicVar1;
import thread2.service.Service;
import thread2.service.Service2;
import thread2.service.Service3;
import thread2.service.Service4;
import thread2.service.Service8;
import thread2.service.Service9;
import thread2.service.Servicea;
import thread2.service.Serviceb;
import thread2.service.Servicec;
import thread2.service.Serviced;
import thread2.service.Servicee;
import thread2.service.Servicef;
import thread2.service.Serviceg;
import thread2.service.Serviceh;
import thread2.service.Servicei;
import thread2.service.Sub1;
import thread2.service.Task;
import thread2.service.Task1;
import thread2.service.Task2;
import thread2.service.UserInfo;
import thread2.service.InnerClass.PrivateClass;
import thread2.service.InnerClass2.PrivateClass2;
import thread2.service.OutClass1.Inner;
import thread2.service.OutClass2.Inner1;
import thread2.service.OutClass2.Inner2;


public class Run {

	public static void main(String[] args) throws InterruptedException {
		
		/*此处的num是方法内部的私有变量，不存在“非线程安全”问题
		HasSelfPrivateNum1 numRef = new HasSelfPrivateNum1();
		Mythread01 thread1 = new Mythread01(numRef);
		thread1.start();
		Mythread02 thread2 = new Mythread02(numRef);
		thread2.start();
		*/
		
		/*这里演示了两个线程同时访问一个没有同步的方法（方法前没有synchronized）可能出现“非线程安全”问题，只要在public void addI前面加上synchronized就可以避免这种问题
		HasSelfPrivateNum2 numRef = new HasSelfPrivateNum2();
		Mythread03 thread1 = new Mythread03(numRef);
		thread1.start();
		Mythread04 thread2 = new Mythread04(numRef);
		thread2.start();
		*/
		
		/*两个线程分别访问同一个类的两个不同实例的相同名称的同步方法，效果是以一步的方式运行的（创建了两个HasSelfPrivateNum2类的对象，就会产生两把锁）
		HasSelfPrivateNum2 numRef1 = new HasSelfPrivateNum2();
		HasSelfPrivateNum2 numRef2 = new HasSelfPrivateNum2();
		Mythread03 thread1 = new Mythread03(numRef1);
		thread1.start();
		Mythread04 thread2 = new Mythread04(numRef2);
		thread2.start();
		*/
		
		/*没有调用关键字synchronized，两个线程一同进入methodA方法
		MyObject1 o = new MyObject1();
		Mythread05 m1 = new Mythread05(o);
		Mythread05 m2 = new Mythread05(o);
		m1.start();
		m2.start();
		*/
		
		/*使用关键字synchronized声明的方法一定是派对运行的
		MyObject2 o = new MyObject2();
		Mythread06 m1 = new Mythread06(o);
		Mythread06 m2 = new Mythread06(o);
		m1.start();
		m2.start();
		*/
		
		/*1）A线程若先持有object对象的Lock锁，B线程可以以异步的方式调用object对象中的非synchronized类型的方法；
		 * 2）A线程先持有object对象的Lock锁，B线程如果在这时调用object对象中的synchronized类型的方法则需等待，也就是同步。
		 
		MyObject3 o = new MyObject3();
		Mythread07 m1 = new Mythread07(o);
		Mythread08 m2 = new Mythread08(o);
		m1.start();
		m2.start();
		*/
		
		/*演示脏读——出现脏读是因为public void getValue()方法并不是同步的，所以可以在任意时刻调用
		PublicVar1 publicVar = new PublicVar1();
		Mythread09 thread = new Mythread09(publicVar);
		thread.start();
		Thread.sleep(1000);//打印结果受此值大小影响
		publicVar.getValue();
		*/
		
		/*测试关键字synchronized锁重入的功能（这里可以将线程类的实例变量service写到run方法里面变成私有变量，就不需要重写构造方法了）
		Service service = new Service();
		Mythread10 thread = new Mythread10(service);
		thread.start();
		*/
		
		/*子类完全可以通过“可重入锁”调用父类同步的方法
		Mythread11 thread = new Mythread11();
		thread.start();
		*/
		
		
		/*同步不具有继承性
		Sub1 sub = new Sub1();
		Mythread12 thread1 = new Mythread12(sub);
		thread1.setName("A");
		thread1.start();
		Mythread12 thread2 = new Mythread12(sub);
		thread2.setName("B");
		thread2.start();
		*/
		
		/*synchronized方法的弊端——执行效率低
		 * A线程调用同步方法执行一个长时间的任务，那么B线程则必须等待比较长的时间
		Task task = new Task();
		Mythread13 thread1 = new Mythread13(task);
		Mythread14 thread2 = new Mythread14(task);
		thread1.start();
		thread2.start();
		Thread.sleep(7000);
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime1 > CommonUtils.beginTime2){
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime1 < CommonUtils.endTime2){
			endTime = CommonUtils.endTime2;
		}
		System.out.println("耗时："+(endTime-beginTime)/1000+"s");
		*/
		
		/*synchronized同步代码块的使用
		ObjectService service = new ObjectService();
		Mythread15 thread1 = new Mythread15(service);
		thread1.start();
		Mythread15 thread2 = new Mythread15(service);
		thread2.start();
		*/
		
		/*用同步代码块解决同步方法执行效率低的弊端
		 * 当一个线程访问object的一个synchronized同步代码快时，另一个线程仍然可以该object对象中的非synchronized(this)同步代码快
		 * 事实证明运行效率确实加快了
		Task1 task = new Task1();
		Mythread16 thread1 = new Mythread16(task);
		Mythread17 thread2 = new Mythread17(task);z
		thread1.start();
		thread2.start();
		Thread.sleep(7000);
		long beginTime = CommonUtils.beginTime1;
		if(CommonUtils.beginTime1 > CommonUtils.beginTime2){
			beginTime = CommonUtils.beginTime2;
		}
		long endTime = CommonUtils.endTime1;
		if(CommonUtils.endTime1 < CommonUtils.endTime2){
			endTime = CommonUtils.endTime2;
		}
		System.out.println("耗时："+(endTime-beginTime)/1000+"s");
		*/
		
		/*不在synchronized块中就是异步执行，在synchronized块中就是同步执行。
		 * 同时注意同步部分Thread-0与Thread-1两个线程同时去抢这把锁，不一定谁先抢到先运行
		Task2 task = new Task2();
		Mythread18 thread1 = new Mythread18(task);
		Mythread18 thread2 = new Mythread18(task);
		thread1.start();
		thread2.start();
		*/
		
		/*synchronized代码块间的同步性
		 * 当一个线程访问object的一个synchronized (this)同步代码块时，其他线程对同一个object中所有其他synchronized(this)同步代码快的访问将被阻塞。
		ObjectService2 service = new ObjectService2();
		Mythread19 thread1 = new Mythread19(service);
		Mythread20 thread2 = new Mythread20(service);
		thread1.start();
		thread2.start();
		*/
		
		/*将任意对象作为对象监视器——使用synchronized(非this对象)
		Service2 service = new Service2();
		Mythread21 thread1 = new Mythread21(service);
		thread1.setName("A");
		Mythread22 thread2 = new Mythread22(service);
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*使用synchronized(非this对象)同步代码快格式进行同步操作时，对象监视器必须是同一个对象。如果不是同一个对象监视器，进行的结果就是异步调用了
		Service3 service = new Service3();
		Mythread23 thread1 = new Mythread23(service);
		thread1.setName("A");
		Mythread24 thread2 = new Mythread24(service);
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		
		/*验证使用synchronized(非this对象)同步代码块格式时，持有不同对象监视器是异步的效果
		Service4 service = new Service4();
		Mythread25 thread1 = new Mythread25(service);
		Mythread26 thread2 = new Mythread26(service);
		thread1.start();
		thread2.start();
		*/
		
		/*验证使用“synchronized(非this对象)同步代码块，多个线程调用同一个方法是随机的所以可能出现“脏读”的情况
		Mylist list = new Mylist();
		Mythread27 thread1 = new Mythread27(list);
		thread1.setName("A");
		Mythread28 thread2 = new  Mythread28(list);
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*演示“脏读”出现——原因是两个线程以异步的方式返回list参数的size()大小
		Mylist2 list = new Mylist2();
		Mythread29 thread1 = new Mythread29(list);
		Mythread30 thread2 = new Mythread30(list);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		Thread.sleep(5000);//如果这个时间不够长显示结果会是0
		System.out.println(list.getSize());
		*/
		
		/*解决“脏读”问题*——对list参数的getSize()方法做同步的调用（将list作为对象监视器）
		 * 这时候mylist2中的方法就没必要加synchronized了
		Mylist2 list = new Mylist2();
		Mythread31 thread1 = new Mythread31(list);
		Mythread32 thread2 = new Mythread32(list);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		Thread.sleep(5000);//如果这个时间不够长显示结果会是0
		System.out.println(list.getSize());
		*/
		
		/*关键字synchronized还可以应用在static静态方法上，如果这样写，是对当前的java文件对应的Class类进行持锁
		Mythread33 thread1 = new Mythread33();
		thread1.setName("A");
		Mythread34 thread2 = new Mythread34();
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*synchronized关键字加到static静态方法上是给Class类上锁，而synchronized关键字加到到非static方法上是给对象上锁
		 * 验证两个锁不是同一个锁
		 * 异步的原因是持有不同的锁，一个是对象锁，一个是Class锁，Class锁对对象实例的synchronized关键字加到到非static方法上的方法不起作用
		Service8 service = new Service8();
		Mythread35 a = new Mythread35(service);
		Mythread36 b = new Mythread36(service);
		Mythread37 c = new Mythread37(service);
		a.setName("A");
		b.setName("B");
		c.setName("C");
		a.start();
		b.start();
		c.start();
		*/
		
		/*Class锁可以对类的所有对象实例起作用
		Service9 service1 = new Service9();
		Service9 service2 = new Service9();
		Mythread38 thread1 = new Mythread38(service1);
		Mythread39 thread2 = new Mythread39(service2);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*同步synchronized(class)代码块的作用其实和synchronized static方法的作用是一样的
		Servicea service1 = new Servicea();
		Servicea service2 = new Servicea();
		Mythread40 thread1 = new Mythread40(service1);
		Mythread41 thread2 = new Mythread41(service2);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*出现这种情况是由于有常量池缓存的功能——String的两个值都是AA，两个线程持有相同的锁
		Serviceb service = new Serviceb();
		Mythread42 thread1 = new Mythread42(service);
		Mythread43 thread2 = new Mythread43(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*为了解决常量池缓存的功能带来的synchronized(String)同步快中的问题
		 * 同步synchronized代码块都不使用String作为锁对象，而改用其他，比如new Object()实例化一个Object对象
		 * 笔者亲测new String()实例化一个String对象效果是一样的
		Servicec service = new Servicec();
		Mythread44 thread1 = new Mythread44(service);
		Mythread45 thread2 = new Mythread45(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		thread2.start();
		*/
		
		/*同步方法容易造成死循环——线程B永远得不到运行的机会，锁死了
		Serviced service = new Serviced();
		Mythread46 thread1 = new Mythread46(service);
		Mythread47 thread2 = new Mythread47(service);
		thread1.start();
		thread2.start();
		*/
		
		/*使用同步块来解决同步方法造成死循环的问题
		 * 方法A中有无限循环，要使用同步代码块，二方法B中没有，可以不使用同步代码块，直接使用synchronized public void methodB()同步方法
		Servicee service = new Servicee();
		Mythread48 thread1 = new Mythread48(service);
		Mythread49 thread2 = new Mythread49(service);
		thread1.start();
		thread2.start();
		*/
		/*死锁是程序设计的bug，在设计程序时就要避免双方互相持有对方的锁的情况。
		 * 示例中使用synchronized嵌套的代码结构来实现死锁，其实不使用嵌套的synchronized代码结构也会出现死锁。只要互相等待对方释放锁就有可能出现死锁。
		Mythread50 t1 = new Mythread50();
		t1.setFlag("a");
		Thread thread1 = new Thread(t1);
		thread1.start();
		Thread.sleep(500);
		t1.setFlag("b");
		Thread thread2 = new Thread(t1);
		thread2.start();
		*/
		
		/*测试内置类
		 * 如果InnerClass.java类和Run.java类不在同一个包中，需要将PrivateClass内置声明成public公开的，不然无法import
		 * 就算是在同一个包中，也需要import相应内置类import service.InnerClass.PrivateClass;
		InnerClass innerClass = new InnerClass();
		innerClass.setUsername("username");
		innerClass.setPassword("password");
		System.out.println(innerClass.getUsername()+" "+innerClass.getPassword());
		//想要实例化内置类必须使用以下代码——通过外部类的实例化对象才能实例化内置类
		PrivateClass privateClass = innerClass.new PrivateClass();
		privateClass.setAge("age");
		privateClass.setAddress("address");
		System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
		*/
		
		/*测试静态内置类——规则与内置类相同
		InnerClass2 innerClass = new InnerClass2();
		innerClass.setUsername("username");
		innerClass.setPassword("password");
		System.out.println(innerClass.getUsername()+" "+innerClass.getPassword());
		//实例化静态内置类有所不同——不用通过外部类的实例化对象就能实例化静态内置类
		PrivateClass2 privateClass = new PrivateClass2();
		privateClass.setAge("age");
		privateClass.setAddress("address");
		System.out.println(privateClass.getAge()+" "+privateClass.getAddress());
		*/
		
		/*内部类与同步——测试1
		 * 内置类中有两个同步方法，但是用的却是不同的锁，打印的结果也是异步的
		 * 由于持有不同的“对象监视器”，所以打印的结果是乱序的
		final Inner inner = new Inner();
		//当线程内重写的方法比较简单时可以用这种方法直接新建线程，两种写法结果是一样的（这里需要将inner定义为一个常量）
//		Thread t1 = new Thread(){
//			@Override
//			public void run() {
//				inner.methodA();
//			}
//		};
//		t1.setName("A");
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner.methodA();
			}
		},"A");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				inner.methodB();
			}
		},"B");
		t1.start();
		t2.start();
		*/
		
		/*内部类与同步——测试2
		 * 同步代码快synchronized (class2)对class2上锁后，其他线程只能以同步的方式调用class2中的静态同步方法
		final Inner1 in1 = new Inner1();
		final Inner2 in2 = new Inner2();
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.methodA(in2);
			}
		},"A");
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				in1.methodB();
			}
		},"B");
		Thread t3 = new Thread(new Runnable() {
			@Override
			public void run() {
				in2.methodA();
			}
		},"C");
		t1.start();
		t2.start();
		t3.start();
		*/
		
		/* Thread.sleep(50);
		 * 如果有这句话就是异步的——0.05秒内锁变成了“5678”，不是同一把锁了
		 * 如果没有这句话就是同步的——两个线程持有的锁都是“1234”，虽然将锁改成了“5678”，但结果还是同步的
		Servicef service = new Servicef();
		Mythread51 thread1  = new Mythread51(service);
		Mythread51 thread2  = new Mythread51(service);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
//		Thread.sleep(50);
		thread2.start();
		*/
		
		/*示例说明——只要锁的对象不变，即是对象的属性被改变，运行的结果还是同步
		Serviceg service = new Serviceg();
		UserInfo user = new UserInfo("aaa","bbb");
		Mythread52 thread1 = new Mythread52(service, user);
		Mythread52 thread2 = new Mythread52(service, user);
		thread1.setName("A");
		thread2.setName("B");
		thread1.start();
		user.setUsername("AAA");
		thread2.start();
		*/
		
		/*同步死循环
		 * 停不下来的原因是main线程一直在处理while()循环，导致程序不能继续执行后面的代码
		 * 解决的办法当然是使用多线程技术
		PrintString p = new PrintString();
		p.method();
		System.out.println("我想要终止这个死循环");
		p.setContinuePrint(false);
		*/
		
		/*采用线程解决上面同步死循环的问题
		PrintString1 p = new PrintString1();
		//这里直接用p.run()也会进入同步死循环
		new Thread(p).start();
		System.out.println("我想要终止这个死循环");
		p.setContinuePrint(false);
		*/
		
		/*异步死循环
		 * 如果使用Eclipse开发环境运行，结果是不会进入死循环
		 * 将JVM的运行的参数改为-service的话，会进入死循环，但是System.out.println("已经改成false了！！！")会执行，但是System.out.println("线程停止了！！！")不会被执行
		 * 这个问题其实就是私有堆栈中的值和公共堆栈中的值不同步造成的，解决这样的问题就要使用volatile关键字
		Mythread53 thread = new Mythread53();
		thread.start();
		Thread.sleep(2000);
		thread.setRunning(false);
		System.out.println("已经改成false了！！！");
		*/
		
		/*使用volatile关键字解决之前的异步死循环问题
		 * 它主要的作用就是当线程的访问running这个变量的时候，强制性从公共堆栈中进行取值
		Mythread54 thread = new Mythread54();
		thread.start();
		Thread.sleep(2000);
		thread.setRunning(false);
		System.out.println("已经改成false了！！！");
		*/
		
		/* 两个关键字都不使用数只输出不全且有重复，不按顺序输出
		 * 使用volatile而不使用synchronized关键字可以得到每一个值不重复但不按照顺序输出
		 * 这里如果在方法前使用synchronized关键字，也就没有必要使用volatile关键字来声明count变量了——可以得到每一个值不重复且按照顺序输出
		//记住这种建立数组的写法
		Mythread55[] threads = new Mythread55[100];
		for(int i=0;i<100;i++){
			threads[i] = new Mythread55(); 
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		*/
		
		/*原子操作时不能分割的整体，没有其他线程能够中断或检查正在原子操作中的变量
		 * 一个原子类型就是一个原子操作的可用类型。它可以在没有锁的情况下做到线程安全。（但是不是同步的，需要将run方法添加关键字synchronized才能同步）
		Mythread56 thread = new Mythread56();
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		Thread t3 = new Thread(thread);
		Thread t4 = new Thread(thread);
		Thread t5 = new Thread(thread);
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		*/
		
		/*原子类也并不完全安全——在具有逻辑性的情况下输出结果也具有随机性
		 * 出现这样的情况是因为addAndGet()方法是原子的，但方法和方法之间的调用却不是原子的，解决这样的问题必须使用同步
		Serviceh serivce = new Serviceh();
		Mythread57[] threads = new Mythread57[5];
		for (int i = 0; i < 5; i++) {
			threads[i] = new Mythread57(serivce);
		}
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		*/
		
		/*在-service服务器模式运行此项目如果没有synchronized代码System.out.println("停下来了！！！");不会被运行
		 * 示例中得到这个结果是因为各线程的数据值没有可视性，而关键字synchronized可以具有可视性
		Servicei service = new Servicei();
		Mythread58 thread1 = new Mythread58(service);
		Mythread59 thread2 = new Mythread59(service);
		thread1.start();
		thread2.start();
		System.out.println("已经发起了停止命令！！！");
		*/
		
		
		
	}
}
