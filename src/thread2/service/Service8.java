package thread2.service;

public class Service8 {
	synchronized public static void printA() {
		try {
			System.out.println("inprintA ThreadName="+ Thread.currentThread().getName()+" time="+System.currentTimeMillis());
			Thread.sleep(2000);
			System.out.println("outprintA ThreadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());

		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	synchronized public static void printB() {
		System.out.println("inprintB ThreadName="+ Thread.currentThread().getName()+" time="+System.currentTimeMillis());
		System.out.println("outprintB ThreadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
	}
	synchronized public void printC() {
		System.out.println("inprintC ThreadName="+ Thread.currentThread().getName()+" time="+System.currentTimeMillis());
		System.out.println("outprintC ThreadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
	}
}
