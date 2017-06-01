package thread2.service;

public class Servicea {
	public static void printA() {
		synchronized(Servicea.class) {
			try {
				System.out.println("inprintA ThreadName="+ Thread.currentThread().getName()+" time="+System.currentTimeMillis());
				Thread.sleep(2000);
				System.out.println("outprintA ThreadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());

			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void printB() {
		synchronized (Servicea.class) {
			System.out.println("inprintB ThreadName="+ Thread.currentThread().getName()+" time="+System.currentTimeMillis());
			System.out.println("outprintB ThreadName="+Thread.currentThread().getName()+" time="+System.currentTimeMillis());
		}
	}
}
