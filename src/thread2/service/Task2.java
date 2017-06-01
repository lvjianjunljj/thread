package thread2.service;

public class Task2 {
	public void doLongTimeTask(){
		for(int i=0;i<100;i++){
			System.out.println("nosynchronized ThreadName="+Thread.currentThread().getName()+" i="+i);
		}
		synchronized (this) {
			for(int i=0;i<100;i++){
				System.out.println("synchronized ThreadName="+Thread.currentThread().getName()+" i="+i);
			}
		}
	}
}
