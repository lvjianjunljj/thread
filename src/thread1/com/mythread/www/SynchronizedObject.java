package thread1.com.mythread.www;

public class SynchronizedObject {
	synchronized public void printString(){
		System.out.println("begin!!!");
		if(Thread.currentThread().getName()=="a"){
			System.out.println("a线程被永远suspend了");
			Thread.currentThread().suspend();
		}
		System.out.println("end!!!");
	}
}
